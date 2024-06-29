
package com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.common.Children;
import com.kittyvt.domain.bnk.hirc.body.common.NodeBaseParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_base_params",
    "group_type",
    "group_id",
    "default_switch",
    "continuous_validation",
    "children",
    "switch_groups",
    "switch_params"
})
@Data
public class SwitchContainer {

    @JsonProperty("node_base_params")
    public NodeBaseParams nodeBaseParams;
    @JsonProperty("group_type")
    public Integer groupType;
    @JsonProperty("group_id")
    public Integer groupId;
    @JsonProperty("default_switch")
    public Long defaultSwitch;
    @JsonProperty("continuous_validation")
    public Integer continuousValidation;
    @JsonProperty("children")
    public Children children;
    @JsonProperty("switch_groups")
    public List<SwitchGroup> switchGroups;
    @JsonProperty("switch_params")
    public List<SwitchParam> switchParams;

}
