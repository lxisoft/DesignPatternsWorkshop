package com.mhmdanish.animalgame.decorator;

import com.mhmdanish.animalgame.animal.AnimalMAB;

public class IOTAnimalMAB extends AnimalMAB {

	AnimalMAB animal;
	
	public IOTAnimalMAB(AnimalMAB animal) {
		this.animal = animal;
	}
	
	public void eatMAB() {
		System.out.print("IOT Animal ");
		this.animal.eatMAB();
	}

	public void walkMAB() {
		System.out.print("IOT Animal ");
		this.animal.walkMAB();
	}
}
