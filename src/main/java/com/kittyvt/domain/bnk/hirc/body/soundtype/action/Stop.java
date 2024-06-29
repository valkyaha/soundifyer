
package com.kittyvt.domain.bnk.hirc.body.soundtype.action;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "flags1",
        "flags2"
})

public class Stop {

    @JsonProperty("flags1")
    public Integer flags1;
    @JsonProperty("flags2")
    public Integer flags2;

}
