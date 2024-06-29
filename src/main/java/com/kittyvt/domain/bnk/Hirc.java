
package com.kittyvt.domain.bnk;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kittyvt.domain.bnk.hirc.HIRCObject;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hirc {

    @JsonProperty("object_count")
    public Integer objectCount;
    @JsonProperty("objects")
    public List<HIRCObject> objects;
}
