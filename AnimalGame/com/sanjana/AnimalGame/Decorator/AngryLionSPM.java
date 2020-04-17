package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class AngryLionSPM extends AddOnDecoratorSPM{

	AnimalSPM animal;
	public AngryLionSPM(AnimalSPM animal) {
		this.animal = animal;
	}
	@Override
	public int strengthSPM() {
		// TODO Auto-generated method stub
		return this.animal.strengthSPM()+(int)(Math.random()*100);
	}

	@Override
	public String featureSPM() {
		// TODO Auto-generated method stub
		return null;
	}

}
