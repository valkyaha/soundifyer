
package com.kittyvt.domain.bnk.hirc.body.soundtype.randomseq;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.common.Children;
import com.kittyvt.domain.bnk.hirc.body.common.NodeBaseParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_base_params",
    "loop_count",
    "loop_mod_min",
    "loop_mod_max",
    "transition_time",
    "transition_time_mod_min",
    "transition_time_mod_max",
    "avoid_repeat_count",
    "transition_mode",
    "random_mode",
    "mode",
    "flags",
    "children",
    "playlist"
})

public class RandomSequenceContainer {

    @JsonProperty("node_base_params")
    public NodeBaseParams nodeBaseParams;
    @JsonProperty("loop_count")
    public Integer loopCount;
    @JsonProperty("loop_mod_min")
    public Integer loopModMin;
    @JsonProperty("loop_mod_max")
    public Integer loopModMax;
    @JsonProperty("transition_time")
    public Double transitionTime;
    @JsonProperty("transition_time_mod_min")
    public Double transitionTimeModMin;
    @JsonProperty("transition_time_mod_max")
    public Double transitionTimeModMax;
    @JsonProperty("avoid_repeat_count")
    public Integer avoidRepeatCount;
    @JsonProperty("transition_mode")
    public Integer transitionMode;
    @JsonProperty("random_mode")
    public Integer randomMode;
    @JsonProperty("mode")
    public Integer mode;
    @JsonProperty("flags")
    public Integer flags;
    @JsonProperty("children")
    public Children children;
    @JsonProperty("playlist")
    public Playlist playlist;

}
