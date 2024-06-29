
package com.kittyvt.domain.bnk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.HIRCObject;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "object_count",
        "objects"
})
public class Hirc {

    @JsonProperty("object_count")
    public Integer objectCount;
    @JsonProperty("objects")
    public List<HIRCObject> objects;
}
