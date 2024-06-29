
package com.kittyvt.domain.bnk.hirc.body.soundtype.action;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stop",
    "except"
})

public class StopEO {

    @JsonProperty("stop")
    public Stop stop;
    @JsonProperty("except")
    public Except except;

}
