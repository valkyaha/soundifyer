package com.kittyvt.domain.bnk.hirc.body.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "rtpc_type",
        "rtpc_accum",
        "param_id",
        "curve_id",
        "curve_scaling",
        "graph_points"
})
public class Rtpc {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("rtpc_type")
    public String rtpcType;
    @JsonProperty("rtpc_accum")
    public String rtpcAccum;
    @JsonProperty("param_id")
    public Integer paramId;
    @JsonProperty("curve_id")
    public Integer curveId;
    @JsonProperty("curve_scaling")
    public String curveScaling;
    @JsonProperty("graph_points")
    public List<GraphPoint> graphPoints;

}