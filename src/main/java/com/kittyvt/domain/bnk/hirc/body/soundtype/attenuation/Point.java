
package com.kittyvt.domain.bnk.hirc.body.soundtype.attenuation;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "from",
        "to",
        "interpolation"
})
@Data
public class Point {

    @JsonProperty("from")
    public Double from;
    @JsonProperty("to")
    public Double to;
    @JsonProperty("interpolation")
    public String interpolation;

}
