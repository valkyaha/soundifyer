
package com.kittyvt.domain.bnk.hirc.body.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_override_parent_fx",
    "fx_bypass_bits",
    "fx_chunks"
})

public class NodeInitialFxParameters {

    @JsonProperty("is_override_parent_fx")
    public Integer isOverrideParentFx;
    @JsonProperty("fx_bypass_bits")
    public Integer fxBypassBits;
    @JsonProperty("fx_chunks")
    public List<java.lang.Object> fxChunks;

}
