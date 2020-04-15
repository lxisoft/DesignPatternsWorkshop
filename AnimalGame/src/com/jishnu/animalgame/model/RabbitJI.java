package com.jishnu.animalgame.model;

import com.jishnu.animalgame.util.stratergy.sound.SqueakSoundStratergy;

public class RabbitJI  extends AnimalJI{
	public RabbitJI(){
		this.soundStratergy = new SqueakSoundStratergy();
	}
}