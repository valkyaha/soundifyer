
package com.kittyvt.domain.bnk.hirc.body.soundtype.action;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kittyvt.deserializer.ParamsDeserializer;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "action_type",
        "external_id",
        "is_bus",
        "prop_bundle",
        "ranged_modifiers",
        "params"
})
@Data
public class Action {

    @JsonProperty("action_type")
    public Integer actionType;
    @JsonProperty("external_id")
    public Long externalId;
    @JsonProperty("is_bus")
    public Integer isBus;
    @JsonProperty("prop_bundle")
    public List<java.lang.Object> propBundle;
    @JsonProperty("ranged_modifiers")
    public RangedModifiers rangedModifiers;

    @JsonDeserialize(using = ParamsDeserializer.class)
    @JsonProperty("params")
    public Object params;

}
