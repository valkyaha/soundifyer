
package com.kittyvt.domain.bnk.hirc.body.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items"
})

public class Children {

    @JsonProperty("items")
    public List<Integer> items;

}
