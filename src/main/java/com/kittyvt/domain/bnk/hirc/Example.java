
package com.kittyvt.domain.bnk.hirc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kittyvt.domain.bnk.Section;
import lombok.Data;

import java.util.List;

@Data
public class Example {

    @JsonProperty("sections")
    public List<Section> sections;

}
