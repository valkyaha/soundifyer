
package com.kittyvt.domain.bnk.hirc.body.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prop_initial_values",
    "prop_ranged_modifiers"
})

public class NodeInitialParams {

    @JsonProperty("prop_initial_values")
    public List<java.lang.Object> propInitialValues;
    @JsonProperty("prop_ranged_modifiers")
    public PropRangedModifiers propRangedModifiers;

}
