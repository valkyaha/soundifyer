
package com.kittyvt.domain.bnk.hirc.body.soundtype.layercontainer;

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
        "children",
        "layers",
        "is_continuous_validation"
})
@Data
public class LayerContainer {

    @JsonProperty("node_base_params")
    public NodeBaseParams nodeBaseParams;
    @JsonProperty("children")
    public Children children;
    @JsonProperty("layers")
    public List<java.lang.Object> layers;
    @JsonProperty("is_continuous_validation")
    public Integer isContinuousValidation;

}
