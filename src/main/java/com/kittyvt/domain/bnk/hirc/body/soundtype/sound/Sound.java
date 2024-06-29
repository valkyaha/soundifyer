
package com.kittyvt.domain.bnk.hirc.body.soundtype.sound;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.common.NodeBaseParams;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "bank_source_data",
        "node_base_params"
})

public class Sound {

    @JsonProperty("bank_source_data")
    public BankSourceData bankSourceData;
    @JsonProperty("node_base_params")
    public NodeBaseParams nodeBaseParams;

}
