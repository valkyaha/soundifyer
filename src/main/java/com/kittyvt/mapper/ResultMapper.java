package com.kittyvt.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kittyvt.domain.bnk.hirc.AudioConverted;
import com.kittyvt.domain.bnk.hirc.HIRCObject;
import com.kittyvt.searchengine.Searcher;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ResultMapper {

    private ResultMapper() {
    }

    public static Result getResult(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        AudioConverted section = mapper.readValue(file(path), AudioConverted.class);

        Searcher searcher = new Searcher();
        List<HIRCObject> nodes = section.getSections().get(1).getBody().getHirc().getObjects();
        return new Result(searcher, nodes);
    }

    private static File file(String path) {
        if (path == null || path.isBlank()) {
            return new File("src/main/resources/test.json");
        }

        return new File(path);
    }
}
