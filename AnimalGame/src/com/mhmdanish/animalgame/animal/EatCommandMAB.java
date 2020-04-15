package com.mhmdanish.animalgame.animal;

public class EatCommandMAB implements CommandMAB{
	
	AnimalMAB animal;
	
	public EatCommandMAB(AnimalMAB animal) {
		this.animal = animal;
	}

	@Override
	public void executeMAB() {
		animal.eatMAB();
		
	}

}
