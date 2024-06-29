package com.kittyvt.domain.bnk.hirc.body.soundtype.effectcustom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kittyvt.domain.bnk.hirc.body.common.InitialRtpc;
import com.kittyvt.domain.bnk.hirc.body.common.StateChunk;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FxBaseInitialValues {

    @JsonProperty("fx_id")
    public Integer fxId;
    @JsonProperty("params")
    public List<Integer> params;
    @JsonProperty("media")
    public List<Object> media;
    @JsonProperty("initial_rtpc")
    public InitialRtpc initialRtpc;
    @JsonProperty("state_chunk")
    public StateChunk stateChunk;
    @JsonProperty("property_values")
    public List<Object> propertyValues;

}