
package com.kittyvt.domain.bnk.hirc.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Hash"
})
public class Id {

    @JsonProperty("Hash")
    public Integer hash;

}
