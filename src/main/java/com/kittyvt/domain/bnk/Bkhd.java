
package com.kittyvt.domain.bnk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "bank_id",
        "language_fnv_hash",
        "wem_alignment",
        "project_id",
        "padding"
})
public class Bkhd {

    @JsonProperty("version")
    public Integer version;
    @JsonProperty("bank_id")
    public Long bankId;
    @JsonProperty("language_fnv_hash")
    public Integer languageFnvHash;
    @JsonProperty("wem_alignment")
    public Integer wemAlignment;
    @JsonProperty("project_id")
    public Integer projectId;
    @JsonProperty("padding")
    public List<Integer> padding;

}
