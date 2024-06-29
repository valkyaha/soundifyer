
package com.kittyvt.domain.bnk.hirc.body.soundtype.sound;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "plugin",
    "source_type",
    "media_information",
    "params"
})
@Data
public class BankSourceData {

    @JsonProperty("plugin")
    public String plugin;
    @JsonProperty("source_type")
    public String sourceType;
    @JsonProperty("media_information")
    public MediaInformation mediaInformation;
    @JsonProperty("params")
    public List<java.lang.Object> params;

}
