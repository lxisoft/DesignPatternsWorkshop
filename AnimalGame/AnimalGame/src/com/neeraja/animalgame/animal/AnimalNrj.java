package com.neeraja.animalgame.animal;

import com.neeraja.animalgame.animal.behavior.EatBehaviourNrj;

public abstract class AnimalNrj {
	String name;
	EatBehaviourNrj eatBehaviourNrj;

	
	
	public String getName() {
		return name;
	}

	
	public void setEatNrj(){

		eatBehaviourNrj.eatNrj();
	}

	public void eatNrj() {
		System.out.println("Eating");
	}

	public void walkNrj() {
		System.out.println("walking");
	}
}
