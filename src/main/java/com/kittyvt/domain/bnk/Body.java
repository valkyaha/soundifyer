
package com.kittyvt.domain.bnk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BKHD",
    "HIRC"
})

public class Body {

    @JsonProperty("BKHD")
    public Bkhd bkhd;
    @JsonProperty("HIRC")
    public Hirc hirc;

}
