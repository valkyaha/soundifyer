package com.kittyvt.domain.bnk.hirc.body.soundtype.timemodulator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kittyvt.domain.bnk.hirc.body.common.InitialRtpc;
import com.kittyvt.domain.bnk.hirc.body.soundtype.action.RangedModifiers;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimeModulator {
    @JsonProperty("prop_bundle")
    public List<PropBundle> propBundle;
    @JsonProperty("ranged_modifiers")
    public RangedModifiers rangedModifiers;
    @JsonProperty("initial_rtpc")
    public InitialRtpc initialRtpc;
}