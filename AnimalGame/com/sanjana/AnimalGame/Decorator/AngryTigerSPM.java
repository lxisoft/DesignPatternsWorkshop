package com.sanjana.AnimalGame.Decorator;
/**
 * @author sanjana p
 *
 */
import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class AngryTigerSPM extends AddOnDecoratorSPM{
	
	AnimalSPM animal;
	public AngryTigerSPM(AnimalSPM a) {
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
