
package com.kittyvt.domain.bnk.hirc.body.soundtype.events;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actions"
})

public class Event {

    @JsonProperty("actions")
    public List<Integer> actions;

}
