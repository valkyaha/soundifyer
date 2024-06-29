
package com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "switch_id",
    "nodes"
})
@Data
public class SwitchGroup {

    @JsonProperty("switch_id")
    public Long switchId;
    @JsonProperty("nodes")
    public List<Integer> nodes;

}
