
package com.kittyvt.domain.bnk.hirc.body.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unk1",
    "three_dimensional_position_type",
    "speaker_panning_type",
    "listener_relative_routing",
    "override_parent",
    "unk2",
    "enable_diffraction",
    "hold_listener_orientation",
    "hold_emitter_position_and_orientation",
    "enable_attenuation",
    "three_dimensional_spatialization_mode",
    "path_mode",
    "transition_time",
    "vertices",
    "path_list_item_offsets",
    "three_dimensional_automation_params"
})
@Data
public class PositioningParams {

    @JsonProperty("unk1")
    public Boolean unk1;
    @JsonProperty("three_dimensional_position_type")
    public String threeDimensionalPositionType;
    @JsonProperty("speaker_panning_type")
    public String speakerPanningType;
    @JsonProperty("listener_relative_routing")
    public Boolean listenerRelativeRouting;
    @JsonProperty("override_parent")
    public Boolean overrideParent;
    @JsonProperty("unk2")
    public Boolean unk2;
    @JsonProperty("enable_diffraction")
    public Boolean enableDiffraction;
    @JsonProperty("hold_listener_orientation")
    public Boolean holdListenerOrientation;
    @JsonProperty("hold_emitter_position_and_orientation")
    public Boolean holdEmitterPositionAndOrientation;
    @JsonProperty("enable_attenuation")
    public Boolean enableAttenuation;
    @JsonProperty("three_dimensional_spatialization_mode")
    public String threeDimensionalSpatializationMode;
    @JsonProperty("path_mode")
    public String pathMode;
    @JsonProperty("transition_time")
    public Integer transitionTime;
    @JsonProperty("vertices")
    public List<java.lang.Object> vertices;
    @JsonProperty("path_list_item_offsets")
    public List<java.lang.Object> pathListItemOffsets;
    @JsonProperty("three_dimensional_automation_params")
    public List<java.lang.Object> threeDimensionalAutomationParams;

}
