package com.kittyvt;

import com.kittyvt.domain.bnk.hirc.HIRCObject;
import com.kittyvt.mapper.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static com.kittyvt.mapper.ResultMapper.getResult;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            Result result = getResult("");
            List<HIRCObject> list = new ArrayList<>();
            result.searcher().collectAllMatchingObjects("Play_c211006507", result.nodes(), list);
            logger.info("Number of matching objects: {}", list.size());
        } catch (Exception e) {
            logger.error("An error occurred", e);
        }
    }
}