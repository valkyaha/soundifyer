package com.kittyvt.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kittyvt.domain.bnk.hirc.AudioConverted;
import com.kittyvt.domain.bnk.hirc.HIRCObject;
import com.kittyvt.searchengine.Searcher;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ResultMapper {

    public static Result getResult() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File e = new File("src/main/resources/test.json");
        AudioConverted section = mapper.readValue(e, AudioConverted.class);

        Searcher searcher = new Searcher();
        List<HIRCObject> nodes = section.getSections().get(1).getBody().getHirc().getObjects();
        return new Result(searcher, nodes);
    }
}
