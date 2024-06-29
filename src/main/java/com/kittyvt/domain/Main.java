package com.kittyvt.domain;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kittyvt.domain.bnk.hirc.Example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File e = new File("E:\\Projects\\soundifyer\\src\\main\\resources\\test.json");

            JsonNode jsonNode = mapper.readTree(e);
            System.out.println(jsonNode.get("sections"));
            Example section = mapper.readValue(e, Example.class);
            section.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

//com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize value of type
//`java.util.ArrayList<com.kittyvt.domain.bnk.hirc.HIRCBody>` from Object value (token `JsonToken.START_OBJECT`)
//at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 33, column: 23]
//        (through reference chain:
//com.kittyvt.domain.bnk.hirc.Example["sections"]->java.util.ArrayList[1]->com.kittyvt.domain.bnk.Section["body"]->com.kittyvt.domain.bnk.Body["HIRC"]
//        ->com.kittyvt.domain.bnk.Hirc["objects"]->java.util.ArrayList[0]->com.kittyvt.domain.bnk.hirc.HIRCObject["body"])