package com.mhmdanish.animalgame.decorator;

import com.mhmdanish.animalgame.animal.AnimalMAB;

public class WebAnimalMAB extends AnimalMAB {
AnimalMAB animal;
	
	public WebAnimalMAB(AnimalMAB animal) {
		this.animal = animal;
	}
	
	public void eatMAB() {
		System.out.print("Web Animal ");
		this.animal.eatMAB();
	}

	public void walkMAB() {
		System.out.print("Web Animal ");
		this.animal.walkMAB();
	}
}
