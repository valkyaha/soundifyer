
package com.kittyvt.domain.bnk.hirc.body.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "unk1",
        "unk2",
        "unk3",
        "override_reflections_aux_bus",
        "has_aux",
        "override_user_aux_sends",
        "unk4",
        "aux1",
        "aux2",
        "aux3",
        "aux4",
        "reflections_aux_bus"
})
public class AuxParams {

    @JsonProperty("unk1")
    public Boolean unk1;
    @JsonProperty("unk2")
    public Boolean unk2;
    @JsonProperty("unk3")
    public Boolean unk3;
    @JsonProperty("override_reflections_aux_bus")
    public Boolean overrideReflectionsAuxBus;
    @JsonProperty("has_aux")
    public Boolean hasAux;
    @JsonProperty("override_user_aux_sends")
    public Boolean overrideUserAuxSends;
    @JsonProperty("unk4")
    public Integer unk4;
    @JsonProperty("aux1")
    public Integer aux1;
    @JsonProperty("aux2")
    public Integer aux2;
    @JsonProperty("aux3")
    public Integer aux3;
    @JsonProperty("aux4")
    public Integer aux4;
    @JsonProperty("reflections_aux_bus")
    public Integer reflectionsAuxBus;

}
