package com.sanjana.AnimalGame.Decorator;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class IotBasedAnimalSPM extends AddOnDecoratorSPM{
	
	AnimalSPM animal;
	public IotBasedAnimalSPM(AnimalSPM a) {
		this.animal = a;
		
	}
   public int strengthSPM() {
	return this.animal.strengthSPM()+(int)(Math.random()*80);
}
@Override
public String featureSPM() {
	// TODO Auto-generated method stub
	return null;
}
}
