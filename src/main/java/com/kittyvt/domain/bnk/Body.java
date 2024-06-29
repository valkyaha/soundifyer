
package com.kittyvt.domain.bnk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "BKHD",
        "HIRC"
})
@Data
public class Body {

    @JsonProperty(value = "BKHD", required = false)
    public Bkhd bkhd;
    @JsonProperty(value = "HIRC", required = false)
    public Hirc hirc;

}
