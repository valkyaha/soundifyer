package com.kittyvt;

import com.kittyvt.domain.bnk.hirc.HIRCObject;
import com.kittyvt.mapper.Result;

import java.util.List;

import static com.kittyvt.mapper.ResultMapper.getResult;

public class Main {
    public static void main(String[] args) {
        try {
            Result result = getResult();

            List<HIRCObject> events = result.searcher().searchEvent(result.nodes(), "Play_c211006507");
            List<HIRCObject> actions = result.searcher().searchActions(events, result.nodes());
            System.out.println(actions.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}