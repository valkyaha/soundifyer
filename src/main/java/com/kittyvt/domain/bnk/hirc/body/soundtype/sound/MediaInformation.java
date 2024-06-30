
package com.kittyvt.domain.bnk.hirc.body.soundtype.sound;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "source_id",
        "in_memory_media_size",
        "source_flags"
})
@Data
public class MediaInformation {

    @JsonProperty("source_id")
    public Long sourceId;
    @JsonProperty("in_memory_media_size")
    public Long inMemoryMediaSize;
    @JsonProperty("source_flags")
    public Long sourceFlags;

}
