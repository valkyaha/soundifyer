
package com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_id",
    "unk1",
    "unk2",
    "unk3",
    "unk4",
    "unk5",
    "unk6",
    "continue_playback",
    "is_first_only",
    "unk9",
    "unk10",
    "unk11",
    "unk12",
    "unk13",
    "unk14",
    "unk15",
    "unk16",
    "fade_out_time",
    "fade_in_time"
})
public class SwitchParam {

    @JsonProperty("node_id")
    public Integer nodeId;
    @JsonProperty("unk1")
    public Boolean unk1;
    @JsonProperty("unk2")
    public Boolean unk2;
    @JsonProperty("unk3")
    public Boolean unk3;
    @JsonProperty("unk4")
    public Boolean unk4;
    @JsonProperty("unk5")
    public Boolean unk5;
    @JsonProperty("unk6")
    public Boolean unk6;
    @JsonProperty("continue_playback")
    public Boolean continuePlayback;
    @JsonProperty("is_first_only")
    public Boolean isFirstOnly;
    @JsonProperty("unk9")
    public Boolean unk9;
    @JsonProperty("unk10")
    public Boolean unk10;
    @JsonProperty("unk11")
    public Boolean unk11;
    @JsonProperty("unk12")
    public Boolean unk12;
    @JsonProperty("unk13")
    public Boolean unk13;
    @JsonProperty("unk14")
    public Boolean unk14;
    @JsonProperty("unk15")
    public Boolean unk15;
    @JsonProperty("unk16")
    public Boolean unk16;
    @JsonProperty("fade_out_time")
    public Integer fadeOutTime;
    @JsonProperty("fade_in_time")
    public Integer fadeInTime;

}
