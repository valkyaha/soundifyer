package com.kittyvt.domain;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kittyvt.domain.bnk.hirc.Example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File e = new File("test.json");
            Example section = mapper.readValue(e, Example.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}