
package com.kittyvt.domain.bnk.hirc;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.kittyvt.domain.bnk.hirc.body.soundtype.action.Action;
import com.kittyvt.domain.bnk.hirc.body.soundtype.attenuation.Attenuation;
import com.kittyvt.domain.bnk.hirc.body.soundtype.events.Event;
import com.kittyvt.domain.bnk.hirc.body.soundtype.layercontainer.LayerContainer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.randomseq.RandomSequenceContainer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.sound.Sound;
import com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer.SwitchContainer;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Attenuation",
        "Sound",
        "RandomSequenceContainer",
        "SwitchContainer",
        "LayerContainer",
        "Action",
        "Event"
})

public class HIRCBody {

    @JsonProperty("Attenuation")
    public Attenuation attenuation;
    @JsonProperty("Sound")
    public Sound sound;
    @JsonProperty("RandomSequenceContainer")
    public RandomSequenceContainer randomSequenceContainer;
    @JsonProperty("SwitchContainer")
    public SwitchContainer switchContainer;
    @JsonProperty("LayerContainer")
    public LayerContainer layerContainer;
    @JsonProperty("Action")
    public Action action;
    @JsonProperty("Event")
    public Event event;

}
