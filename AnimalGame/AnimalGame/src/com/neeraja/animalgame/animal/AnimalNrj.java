package com.neeraja.animalgame.animal;

public abstract class AnimalNrj {
	
	EatBehaviourNrj eatBehaviourNrj;

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
