package com.kittyvt.domain.bnk.hirc.body.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "from",
        "to",
        "interpolation"
})
public class GraphPoint {

    @JsonProperty("from")
    public Float from;
    @JsonProperty("to")
    public Float to;
    @JsonProperty("interpolation")
    public String interpolation;

}
