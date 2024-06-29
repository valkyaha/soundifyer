
package com.kittyvt.domain.bnk.hirc.body;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Volume",
    "PriorityDistanceOffset",
    "UserAuxSendVolume0",
    "GameAuxSendVolume"
})
@Data
public class PropInitialValue {

    @JsonProperty("Volume")
    public Double volume;
    @JsonProperty("PriorityDistanceOffset")
    public Double priorityDistanceOffset;
    @JsonProperty("UserAuxSendVolume0")
    public Double userAuxSendVolume0;
    @JsonProperty("GameAuxSendVolume")
    public Double gameAuxSendVolume;

}
