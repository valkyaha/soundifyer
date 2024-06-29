package com.kittyvt.mapper;

import com.kittyvt.domain.bnk.hirc.HIRCObject;
import com.kittyvt.searchengine.Searcher;

import java.util.List;

public record Result(Searcher searcher, List<HIRCObject> nodes) {
}
