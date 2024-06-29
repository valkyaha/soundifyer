
package com.kittyvt.domain.bnk.hirc.body.soundtype.randomseq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "items"
})
@Data
public class Playlist {

    @JsonProperty("items")
    public List<Item> items;

}
