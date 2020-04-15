package com.neeraja.animalgame.animal;

public abstract class AnimalNrj {
	
	EatBehaviourNrj eatBehaviour;

	public void setEat(){

		eatBehaviour.eat();
	}

	public void eatNrj() {
		System.out.println("Eating");
	}

	public void walkNrj() {
		System.out.println("walking");
	}
}
