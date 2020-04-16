package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunBehavior;
import com.sruthy.animalgame.behaviour.RunWithAimOfPray;
import com.sruthy.animalgame.iotanimal.Lion;
import com.sruthy.animalgame.iotanimal.Monkey;
import com.sruthy.animalgame.iotanimal.Tiger;
import com.sruthy.animalgame.webbasedanimal.Bear;
import com.sruthy.animalgame.webbasedanimal.Dog;
import com.sruthy.animalgame.webbasedanimal.Elephant;

/**
 * @author sruthi
 * 
 * Implemented Factory Pattern, Strategy Pattern
 * Implemented Template Pattern
 *
 */
public class WebBasedAnimal extends Animal{
	
	/**
	 * @author sruthi
	 * Implemented factory pattern and strategy pattern
	 *
	 */
	public Animal createAnimalsAndBehavioursSKC(String animalName) {

		Animal a = null;
		
		if (animalName.equals("bear")) {
					a= new Bear();

		}
		else if (animalName.equals("dog")) {
			
					a = new Dog();
		}
		else if(animalName.equals("elephant")) {
			
					a = new Elephant();
			
		}
		a.setRunBehaviourSKC(new RunWithAimOfPray());
		return a;
	}

		public void run() {
			System.out.println("Run with Aim Of Pray");
		}

		
}



