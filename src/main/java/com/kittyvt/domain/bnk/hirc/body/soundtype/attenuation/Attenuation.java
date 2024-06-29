
package com.kittyvt.domain.bnk.hirc.body.soundtype.attenuation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.common.InitialRtpc;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "is_cone_enabled",
        "curves_to_use",
        "curves",
        "initial_rtpc"
})
public class Attenuation {

    @JsonProperty("is_cone_enabled")
    public Integer isConeEnabled;
    @JsonProperty("curves_to_use")
    public List<Integer> curvesToUse;
    @JsonProperty("curves")
    public List<Curve> curves;
    @JsonProperty("initial_rtpc")
    public InitialRtpc initialRtpc;

}
