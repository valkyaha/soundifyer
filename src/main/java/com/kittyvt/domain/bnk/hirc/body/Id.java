
package com.kittyvt.domain.bnk.hirc.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Id {

    @JsonProperty("Hash")
    public Long hash;
    @JsonProperty("String")
    public String idString;

}
