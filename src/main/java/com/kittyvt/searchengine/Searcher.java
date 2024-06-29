package com.kittyvt.searchengine;

import com.kittyvt.domain.bnk.hirc.HIRCObject;

import java.util.Collections;
import java.util.List;

public class Searcher {


    public List<HIRCObject> searchEvent(List<HIRCObject> nodes, String id) {
        return nodes.stream().filter(
                k -> isIdPresent(k, id)
        ).toList();
    }

    public List<HIRCObject> searchActions(List<HIRCObject> events, List<HIRCObject> nodes) {
        if (!events.isEmpty()) {
            return nodes.stream().filter(
                    k -> {
                        if (k.getBody().getAction() != null && k.getId() != null && k.getId().getHash() != null) {
                            return events.getFirst().getBody().getEvent().getActions().contains(k.getId().getHash());
                        }
                        return false;
                    }
            ).toList();
        }
        return Collections.emptyList();
    }


    private boolean isIdPresent(HIRCObject hircObject, String idToCheck) {
        if (hircObject.getId() != null) {
            if (hircObject.getId().getHash() != null && idToCheck.equals(hircObject.getId().getHash().toString())) {
                return true;
            }
            return idToCheck.equals(hircObject.getId().getIdString());
        }
        return false;
    }
}
