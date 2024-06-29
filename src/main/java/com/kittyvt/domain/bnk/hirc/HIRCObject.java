
package com.kittyvt.domain.bnk.hirc;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.Id;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "body"
})
@Data
public class HIRCObject {

    @JsonProperty("id")
    public Id id;
    @JsonProperty("body")
    public HIRCBody body;

}
