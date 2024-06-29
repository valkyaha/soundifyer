
package com.kittyvt.domain.bnk.hirc.body;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prop_type",
    "min",
    "max"
})
@Data
public class Entry {

    @JsonProperty("prop_type")
    public Integer propType;
    @JsonProperty("min")
    public Double min;
    @JsonProperty("max")
    public Double max;

}
