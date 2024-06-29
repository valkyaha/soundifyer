
package com.kittyvt.domain.bnk.hirc.body.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "state_property_info",
    "state_group_chunks"
})
@Data
public class StateChunk {

    @JsonProperty("state_property_info")
    public List<java.lang.Object> statePropertyInfo;
    @JsonProperty("state_group_chunks")
    public List<java.lang.Object> stateGroupChunks;

}
