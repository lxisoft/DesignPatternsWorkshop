package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Factory.AnimalFactorySPM;
import com.sanjana.AnimalGame.Factory.IotbasedFactorySPM;
import com.sanjana.AnimalGame.Factory.MobilebasedFactorySPM;

public class AngryLionSPM extends AddOnDecoratorSPM{

	AnimalSPM animal;
	AnimalFactorySPM animalfac;
	public AngryLionSPM(AnimalSPM tiger) {
		this.animal = tiger;
	}
	@Override
	public int strengthSPM() {
		// TODO Auto-generated method stub
		animalfac = new MobilebasedFactorySPM();
		int p = this.animalfac.getAnimalSPM("lion").strengthSPM()+(int)(Math.random()*100);
		return p;
	}

	@Override
	public String featureSPM() {
		// TODO Auto-generated method stub
		return null;
	}

}
