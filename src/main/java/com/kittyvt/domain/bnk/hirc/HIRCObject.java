
package com.kittyvt.domain.bnk.hirc;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "body"
})
public class HIRCObject {

    @JsonProperty("id")
    public Id id;
    @JsonProperty("body")
    public HIRCBody body;

}
