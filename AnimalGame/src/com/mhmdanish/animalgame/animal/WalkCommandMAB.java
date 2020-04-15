package com.mhmdanish.animalgame.animal;

public class WalkCommandMAB implements CommandMAB {

	AnimalMAB animal;
	
	public WalkCommandMAB(AnimalMAB animal) {
		this.animal = animal;
	}
	
	@Override
	public void executeMAB() {
		animal.walkMAB();

	}

}
