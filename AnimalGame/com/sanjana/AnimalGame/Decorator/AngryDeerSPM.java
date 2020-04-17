package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class AngryDeerSPM extends AddOnDecoratorSPM{
	AnimalSPM animal;

	public AngryDeerSPM(AnimalSPM animal) {
		this.animal = animal;
	}

	@Override
	public int strengthSPM() {
		// TODO Auto-generated method stub
		return this.animal.strengthSPM()+(int)(Math.random()*80);
	}

	@Override
	public String featureSPM() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
