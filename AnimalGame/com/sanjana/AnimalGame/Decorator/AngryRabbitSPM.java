package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Factory.AnimalFactorySPM;
import com.sanjana.AnimalGame.Factory.IotbasedFactorySPM;
import com.sanjana.AnimalGame.Factory.MobilebasedFactorySPM;

public class AngryRabbitSPM extends AddOnDecoratorSPM{

	AnimalSPM animal;
	AnimalFactorySPM animalfac;
	public AngryRabbitSPM(AnimalSPM animal) {
		this.animal = animal;
	}
	@Override
	public int strengthSPM() {
		// TODO Auto-generated method stub
		animalfac = new MobilebasedFactorySPM();
		int q = this.animalfac.getAnimalSPM("rabbit").strengthSPM()+(int)(Math.random()*200);
		return q;
	}

	@Override
	public String featureSPM() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
