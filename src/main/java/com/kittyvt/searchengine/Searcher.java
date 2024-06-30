package com.kittyvt.searchengine;

import com.kittyvt.domain.bnk.hirc.HIRCObject;

import java.util.*;

public class Searcher {

    public List<HIRCObject> searchEvent(final List<HIRCObject> nodes, final String id) {
        return nodes.stream().filter(
                k -> isIdPresent(k, id)
        ).toList();
    }

    public List<HIRCObject> searchActions(List<HIRCObject> actions, final List<HIRCObject> nodes) {
        if (!actions.isEmpty()) {
            return nodes.stream().filter(
                    k -> {
                        if (k.getBody().getAction() != null && k.getId() != null && k.getId().getHash() != null) {
                            return actions.getFirst().getBody().getEvent().getActions().contains(k.getId().getHash());
                        }
                        return false;
                    }
            ).toList();
        }
        return Collections.emptyList();
    }

    public void collectAllMatchingObjects(final Object id, final List<HIRCObject> nodes, List<HIRCObject> list) {
        Set<Object> processedIds = new HashSet<>();
        Queue<Object> toProcess = new LinkedList<>();
        toProcess.add(id);

        while (!toProcess.isEmpty()) {
            Object currentId = toProcess.poll();
            if (processedIds.add(currentId)) {
                List<HIRCObject> matchedNodes = nodes.stream().filter(
                        k -> isIdPresent(k, currentId)
                ).toList();

                for (HIRCObject matchedNode : matchedNodes) {
                    if (!list.contains(matchedNode)) {
                        list.add(matchedNode);

                        if (matchedNode.getBody().getEvent() != null) {
                            toProcess.addAll(matchedNode.getBody().getEvent().getActions());
                        }
                        if (matchedNode.getBody().getAction() != null) {
                            toProcess.add(matchedNode.getBody().getAction().getExternalId());
                        }
                        if (matchedNode.getBody().getSwitchContainer() != null) {
                            toProcess.addAll(matchedNode.getBody().getSwitchContainer().getChildren().getItems());
                        }
                        if (matchedNode.getBody().getSound() != null) {
                            toProcess.add(matchedNode.getBody().getSound().getNodeBaseParams().getDirectParentId());
                            toProcess.add(matchedNode.getBody().getSound().getBankSourceData().getMediaInformation().getSourceId());
                        }
                    }
                }
            }
        }
    }

    private boolean isIdPresent(HIRCObject hircObject, Object idToCheck) {
        if (hircObject.getId() != null) {
            if (idToCheck instanceof Long longId) {
                return longId.equals(hircObject.getId().getHash());
            } else if (idToCheck instanceof String stringId) {
                if (hircObject.getId().getHash() != null && stringId.equals(hircObject.getId().getHash().toString())) {
                    return true;
                }
                return stringId.equals(hircObject.getId().getIdString());
            }
        }
        return false;
    }
}
