package com.kittyvt.searchengine;

import com.kittyvt.domain.bnk.hirc.*;
import com.kittyvt.domain.bnk.hirc.body.common.Children;
import com.kittyvt.domain.bnk.hirc.body.soundtype.layercontainer.LayerContainer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.randomseq.RandomSequenceContainer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer.SwitchContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Searcher {
    private static final Logger logger = LoggerFactory.getLogger(Searcher.class);

    public void collectAllMatchingObjects(Object id, List<HIRCObject> nodes, List<HIRCObject> result) {
        logger.info("Starting collection of all matching objects for id: {}", id);
        Set<Object> processed = new HashSet<>();
        Queue<Object> toProcess = new LinkedList<>(Collections.singleton(id));

        while (!toProcess.isEmpty()) {
            Object currentId = toProcess.poll();
            if (processed.add(currentId)) {
                logger.debug("Processing id: {}", currentId);
                nodes.stream()
                        .filter(k -> isIdPresent(k, currentId))
                        .filter(result::add)
                        .forEach(node -> processNode(node, toProcess, nodes));
            }
        }
        logger.info("Finished collecting all matching objects. Total collected: {}", result.size());
    }

    private void processNode(HIRCObject node, Queue<Object> toProcess, List<HIRCObject> allNodes) {
        if (node.body.event != null) {
            logger.debug("Processing Event with id: {}", node.id.getHash());
            toProcess.addAll(node.body.event.actions);
        }
        if (node.body.action != null) {
            logger.debug("Processing Action with id: {}, external id: {}", node.id.getHash(), node.body.action.externalId);
            toProcess.add(node.body.action.externalId);
            searchRelatedObjects(node.body.action.externalId, allNodes, toProcess);
        }
        processContainer(node.body.randomSequenceContainer, "Random Sequence", node.id.getHash(), toProcess);
        processContainer(node.body.switchContainer, "Switch", node.id.getHash(), toProcess);
        processContainer(node.body.layerContainer, "Layer", node.id.getHash(), toProcess);
        if (node.body.sound != null) {
            logger.debug("Processing Sound with id: {}", node.id.getHash());
            Optional.ofNullable(node.body.sound.nodeBaseParams).map(p -> p.directParentId).ifPresent(toProcess::add);
            Optional.ofNullable(node.body.sound.bankSourceData)
                    .map(b -> b.mediaInformation)
                    .map(m -> m.sourceId)
                    .ifPresent(toProcess::add);
        }
    }

    private void processContainer(Object container, String containerType, Long nodeId, Queue<Object> toProcess) {
        if (container != null) {
            logger.debug("Processing {} Container with id: {}", containerType, nodeId);
            switch (container) {
                case RandomSequenceContainer rsc -> addChildrenToProcess(rsc.children, toProcess);
                case SwitchContainer sc -> addChildrenToProcess(sc.children, toProcess);
                case LayerContainer lc -> addChildrenToProcess(lc.children, toProcess);
                default -> {
                }
            }
        }
    }

    private void addChildrenToProcess(Children children, Queue<Object> toProcess) {
        Optional.ofNullable(children).map(c -> c.items).ifPresent(items -> {
            logger.debug("Adding children to process: {}", items);
            toProcess.addAll(items);
        });
    }

    private void searchRelatedObjects(Long id, List<HIRCObject> allNodes, Queue<Object> toProcess) {
        logger.debug("Searching for objects related to action id: {}", id);
        allNodes.stream()
                .filter(this::isContainer)
                .filter(node -> isRelatedToAction(node, id))
                .map(node -> node.id.getHash())
                .forEach(relatedId -> {
                    logger.debug("Found related object with id: {}", relatedId);
                    toProcess.add(relatedId);
                });
    }

    private boolean isContainer(HIRCObject node) {
        return node.body.event != null || node.body.randomSequenceContainer != null ||
                node.body.switchContainer != null || node.body.layerContainer != null;
    }

    private boolean isRelatedToAction(HIRCObject node, Long actionId) {
        if (node.body == null) return false;
        if (node.body.event != null && node.body.event.actions != null) {
            boolean isRelated = node.body.event.actions.contains(actionId);
            if (isRelated) {
                logger.debug("Event with id {} is related to action {}", node.id.getHash(), actionId);
            }
            return isRelated;
        }
        return isContainerRelatedToAction(node.body.randomSequenceContainer, "Random Sequence", node.id.getHash(), actionId) ||
                isContainerRelatedToAction(node.body.switchContainer, "Switch", node.id.getHash(), actionId) ||
                isContainerRelatedToAction(node.body.layerContainer, "Layer", node.id.getHash(), actionId) ||
                (node.body.sound != null && node.body.sound.nodeBaseParams != null &&
                        Objects.equals(node.body.sound.nodeBaseParams.directParentId, actionId));
    }

    private boolean isContainerRelatedToAction(Object container, String containerType, Long nodeId, Long actionId) {
        return Optional.ofNullable(container)
                .map(c -> switch (c) {
                    case RandomSequenceContainer rsc -> rsc.children;
                    case SwitchContainer sc -> sc.children;
                    case LayerContainer lc -> lc.children;
                    default -> null;
                })
                .map(children -> {
                    boolean isRelated = isChildrenRelatedToAction(children, actionId);
                    if (isRelated) {
                        logger.debug("{} Container with id {} is related to action {}", containerType, nodeId, actionId);
                    }
                    return isRelated;
                })
                .orElse(false);
    }

    private boolean isChildrenRelatedToAction(Children children, Long actionId) {
        return Optional.ofNullable(children)
                .map(c -> c.items)
                .map(items -> items.contains(actionId))
                .orElse(false);
    }

    private boolean isIdPresent(HIRCObject hircObject, Object idToCheck) {
        return Optional.ofNullable(hircObject.id)
                .map(id -> {
                    if (idToCheck instanceof Long longId) return longId.equals(id.getHash());
                    if (idToCheck instanceof String stringId) {
                        return (id.getHash() != null && stringId.equals(id.getHash().toString())) ||
                                stringId.equals(id.getIdString());
                    }
                    return false;
                })
                .orElse(false);
    }
}