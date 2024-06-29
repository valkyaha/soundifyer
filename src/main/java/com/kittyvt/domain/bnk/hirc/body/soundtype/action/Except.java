
package com.kittyvt.domain.bnk.hirc.body.soundtype.action;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exceptions"
})
@Data
public class Except {

    @JsonProperty("exceptions")
    public List<java.lang.Object> exceptions;

}
