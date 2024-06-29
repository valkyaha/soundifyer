package com.kittyvt.domain.bnk.hirc.body.soundtype.timemodulator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropBundle {
    @JsonProperty("Volume")
    public Float volume;
    @JsonProperty("TransitionTime")
    public Integer transitionTime;
}
