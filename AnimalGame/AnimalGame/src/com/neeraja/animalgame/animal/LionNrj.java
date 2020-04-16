package com.neeraja.animalgame.animal;

import com.neeraja.animalgame.animal.behavior.CarnivourousNrj;

public class LionNrj extends AnimalNrj {

	public LionNrj(){
		eatBehaviourNrj = new CarnivourousNrj();
	}

	@Override
	public void fight() {
		System.out.println("lion fighting");
	}

	@Override
	public void rest() {
		System.out.println("lion takes rest");
		
	}

}
