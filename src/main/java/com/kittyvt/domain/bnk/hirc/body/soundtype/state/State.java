package com.kittyvt.domain.bnk.hirc.body.soundtype.state;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class State {
    @JsonProperty("parameters")
    public List<Integer> parameters;
    @JsonProperty("values")
    public List<Float> values;

}