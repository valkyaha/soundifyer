
package com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "switch_id",
    "nodes"
})

public class SwitchGroup {

    @JsonProperty("switch_id")
    public Integer switchId;
    @JsonProperty("nodes")
    public List<Integer> nodes;

}
