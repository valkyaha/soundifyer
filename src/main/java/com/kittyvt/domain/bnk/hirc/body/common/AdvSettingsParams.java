
package com.kittyvt.domain.bnk.hirc.body.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "unk1",
        "unk2",
        "unk3",
        "is_virtual_voices_opt_override_parent",
        "ignore_parent_maximum_instances",
        "unk4",
        "use_virtual_behavior",
        "kill_newest",
        "virtual_queue_behavior",
        "max_instance_count",
        "below_threshold_behavior",
        "unk5",
        "unk6",
        "unk7",
        "unk8",
        "enable_envelope",
        "normalize_loudness",
        "override_analysis",
        "override_hdr_envelope"
})
@Data
public class AdvSettingsParams {

    @JsonProperty("unk1")
    public Boolean unk1;
    @JsonProperty("unk2")
    public Boolean unk2;
    @JsonProperty("unk3")
    public Boolean unk3;
    @JsonProperty("is_virtual_voices_opt_override_parent")
    public Boolean isVirtualVoicesOptOverrideParent;
    @JsonProperty("ignore_parent_maximum_instances")
    public Boolean ignoreParentMaximumInstances;
    @JsonProperty("unk4")
    public Boolean unk4;
    @JsonProperty("use_virtual_behavior")
    public Boolean useVirtualBehavior;
    @JsonProperty("kill_newest")
    public Boolean killNewest;
    @JsonProperty("virtual_queue_behavior")
    public String virtualQueueBehavior;
    @JsonProperty("max_instance_count")
    public Integer maxInstanceCount;
    @JsonProperty("below_threshold_behavior")
    public String belowThresholdBehavior;
    @JsonProperty("unk5")
    public Boolean unk5;
    @JsonProperty("unk6")
    public Boolean unk6;
    @JsonProperty("unk7")
    public Boolean unk7;
    @JsonProperty("unk8")
    public Boolean unk8;
    @JsonProperty("enable_envelope")
    public Boolean enableEnvelope;
    @JsonProperty("normalize_loudness")
    public Boolean normalizeLoudness;
    @JsonProperty("override_analysis")
    public Boolean overrideAnalysis;
    @JsonProperty("override_hdr_envelope")
    public Boolean overrideHdrEnvelope;

}
