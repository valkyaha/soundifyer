
package com.kittyvt.domain.bnk.hirc.body.soundtype.sound;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source_id",
    "in_memory_media_size",
    "source_flags"
})

public class MediaInformation {

    @JsonProperty("source_id")
    public Integer sourceId;
    @JsonProperty("in_memory_media_size")
    public Integer inMemoryMediaSize;
    @JsonProperty("source_flags")
    public Integer sourceFlags;

}
