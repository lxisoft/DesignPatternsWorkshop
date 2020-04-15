package com.mhmdanish.animalgame.decorator;

import com.mhmdanish.animalgame.animal.AnimalMAB;

public class MobileAnimalMAB extends AnimalMAB {
	
AnimalMAB animal;
	
	public MobileAnimalMAB(AnimalMAB animal) {
		this.animal = animal;
	}
	
	public void eatMAB() {
		System.out.print("Mobile Animal ");
		this.animal.eatMAB();
	}

	public void walkMAB() {
		System.out.print("Mobile Animal ");
		this.animal.walkMAB();
	}

}
