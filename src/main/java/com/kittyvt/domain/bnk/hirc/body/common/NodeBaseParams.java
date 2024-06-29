
package com.kittyvt.domain.bnk.hirc.body.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "node_initial_fx_parameters",
        "override_attachment_params",
        "override_bus_id",
        "direct_parent_id",
        "unknown_flags",
        "node_initial_params",
        "positioning_params",
        "aux_params",
        "adv_settings_params",
        "state_chunk",
        "initial_rtpc"
})
@Data
public class NodeBaseParams {

    @JsonProperty("node_initial_fx_parameters")
    public NodeInitialFxParameters nodeInitialFxParameters;
    @JsonProperty("override_attachment_params")
    public Integer overrideAttachmentParams;
    @JsonProperty("override_bus_id")
    public Integer overrideBusId;
    @JsonProperty("direct_parent_id")
    public Integer directParentId;
    @JsonProperty("unknown_flags")
    public Integer unknownFlags;
    @JsonProperty("node_initial_params")
    public NodeInitialParams nodeInitialParams;
    @JsonProperty("positioning_params")
    public PositioningParams positioningParams;
    @JsonProperty("aux_params")
    public AuxParams auxParams;
    @JsonProperty("adv_settings_params")
    public AdvSettingsParams advSettingsParams;
    @JsonProperty("state_chunk")
    public StateChunk stateChunk;
    @JsonProperty("initial_rtpc")
    public InitialRtpc initialRtpc;

}
