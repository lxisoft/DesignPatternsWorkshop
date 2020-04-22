package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Factory.AnimalFactorySPM;
import com.sanjana.AnimalGame.Factory.IotbasedFactorySPM;
import com.sanjana.AnimalGame.Factory.MobilebasedFactorySPM;

public class AngryTigerSPM extends AddOnDecoratorSPM{
	
	AnimalSPM animal;
	AnimalFactorySPM animalfac;
	
	public AngryTigerSPM(AnimalSPM tiger) {
		this.animal = tiger;
		
	}
public int strengthSPM() {
	   animalfac = new MobilebasedFactorySPM();
	   int a = (int)(Math.random()*80);
	   int y=this.animalfac.getAnimalSPM("tiger").strengthSPM()+a;
	   return y;
}
@Override
public String featureSPM() {
	// TODO Auto-generated method stub
	return null;
}
}
