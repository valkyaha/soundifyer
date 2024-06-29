package com.kittyvt.domain.bnk.hirc.body.soundtype.action;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Play {
    @JsonProperty("fade_curve")
    private Integer fadeCurve;
    @JsonProperty("bank_id")
    private Long bankId;
}
