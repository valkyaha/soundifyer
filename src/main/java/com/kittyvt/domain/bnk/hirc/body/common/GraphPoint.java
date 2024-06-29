package com.kittyvt.domain.bnk.hirc.body.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "from",
        "to",
        "interpolation"
})
@Data
public class GraphPoint {

    @JsonProperty("from")
    public Float from;
    @JsonProperty("to")
    public Float to;
    @JsonProperty("interpolation")
    public String interpolation;

}
