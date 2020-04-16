package com.sanjana.AnimalGame.Decorator;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class WebBasedAnimalSPM extends AddOnDecoratorSPM{

	AnimalSPM animal;
	public WebBasedAnimalSPM(AnimalSPM animal) {
		this.animal = animal;
	}
	@Override
	public int strengthSPM() {
		// TODO Auto-generated method stub
		return this.animal.strengthSPM()+(int)(Math.random()*200);
	}

	@Override
	public String featureSPM() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
