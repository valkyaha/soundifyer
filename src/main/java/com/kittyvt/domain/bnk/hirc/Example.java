
package com.kittyvt.domain.bnk.hirc;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.Section;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sections"
})

public class Example {

    @JsonProperty("sections")
    public List<Section> sections;

}
