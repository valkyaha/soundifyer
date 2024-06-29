
package com.kittyvt.domain.bnk.hirc.body.soundtype.randomseq;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "play_id",
    "weight"
})

public class Item {

    @JsonProperty("play_id")
    public Integer playId;
    @JsonProperty("weight")
    public Integer weight;

}
