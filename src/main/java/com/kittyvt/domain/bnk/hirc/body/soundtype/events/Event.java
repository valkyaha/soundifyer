
package com.kittyvt.domain.bnk.hirc.body.soundtype.events;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actions"
})
@Data
public class Event {

    @JsonProperty("actions")
    public List<Integer> actions;

}
