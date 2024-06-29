package com.kittyvt.domain.bnk.hirc.body.soundtype.effectcustom;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EffectCustom {
    @JsonProperty("fx_base_initial_values")
    public FxBaseInitialValues fxBaseInitialValues;
}