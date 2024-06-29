
package com.kittyvt.domain.bnk.hirc;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.kittyvt.domain.bnk.hirc.body.soundtype.actionmixer.ActorMixer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.effectcustom.EffectCustom;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kittyvt.domain.bnk.hirc.body.soundtype.action.Action;
import com.kittyvt.domain.bnk.hirc.body.soundtype.attenuation.Attenuation;
import com.kittyvt.domain.bnk.hirc.body.soundtype.events.Event;
import com.kittyvt.domain.bnk.hirc.body.soundtype.layercontainer.LayerContainer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.randomseq.RandomSequenceContainer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.sound.Sound;
import com.kittyvt.domain.bnk.hirc.body.soundtype.switchcontainer.SwitchContainer;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonProperty("EffectCustom")
    public EffectCustom effectCustom;
    @JsonProperty("Action")
    public Action action;
    @JsonProperty("ActorMixer")
    public ActorMixer actorMixer;
    @JsonProperty("Event")
    public Event event;

}
