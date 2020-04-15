package com.mhmdanish.animalgame.command;

import com.mhmdanish.animalgame.animal.AnimalMAB;

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
