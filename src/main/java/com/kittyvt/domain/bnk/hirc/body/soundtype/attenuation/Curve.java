
package com.kittyvt.domain.bnk.hirc.body.soundtype.attenuation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "curve_scaling",
        "points"
})

public class Curve {

    @JsonProperty("curve_scaling")
    public String curveScaling;
    @JsonProperty("points")
    public List<Point> points;

}
