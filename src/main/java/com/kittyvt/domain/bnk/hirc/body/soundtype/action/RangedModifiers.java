
package com.kittyvt.domain.bnk.hirc.body.soundtype.action;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.Entry;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entries"
})

public class RangedModifiers {

    @JsonProperty("entries")
    public List<Entry> entries;

}
