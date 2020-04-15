package com.mhmdanish.animalgame.command;

import com.mhmdanish.animalgame.animal.AnimalMAB;

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
