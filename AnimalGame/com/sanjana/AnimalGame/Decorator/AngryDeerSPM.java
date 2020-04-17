package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Factory.AnimalFactorySPM;
import com.sanjana.AnimalGame.Factory.IotbasedFactorySPM;

public class AngryDeerSPM extends AddOnDecoratorSPM{
	AnimalSPM animal;
	AnimalFactorySPM animalfac;
	

	public AngryDeerSPM(AnimalSPM animal) {
		this.animal = animal;
	}

	@Override
	public int strengthSPM() {
		// TODO Auto-generated method stub
		animalfac = new IotbasedFactorySPM();
		return this.animalfac.getAnimalSPM("deer").strengthSPM()+(int)(Math.random()*80);
	}

	@Override
	public String featureSPM() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
