package com.kittyvt.domain.bnk.hirc.body.soundtype.actionmixer;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.common.Children;
import com.kittyvt.domain.bnk.hirc.body.common.NodeBaseParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "node_base_params",
        "children"
})
@Data
public class ActorMixer {

    @JsonProperty("node_base_params")
    public NodeBaseParams nodeBaseParams;
    @JsonProperty("children")
    public Children children;

}
