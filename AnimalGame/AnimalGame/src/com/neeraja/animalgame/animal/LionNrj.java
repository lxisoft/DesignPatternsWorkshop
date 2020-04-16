package com.neeraja.animalgame.animal;

import com.neeraja.animalgame.animal.behavior.CarnivourousNrj;

public class LionNrj extends AnimalNrj {

	public LionNrj(){
		eatBehaviourNrj = new CarnivourousNrj();
	}

}
