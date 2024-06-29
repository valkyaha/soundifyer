
package com.kittyvt.domain.bnk.hirc.body.soundtype.action;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "flags1",
        "flags2"
})
@Data
public class Stop {

    @JsonProperty("flags1")
    public Integer flags1;
    @JsonProperty("flags2")
    public Integer flags2;

}
