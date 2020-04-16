package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunWithAimOfPray;
import com.sruthy.animalgame.mobilebasedanimal.Deer;
import com.sruthy.animalgame.mobilebasedanimal.Gorilla;
import com.sruthy.animalgame.mobilebasedanimal.Horse;

/**
 * @author sruthi
 * 
 * Implemented  Factory Pattern, Strategy Pattern
 * Implemented Template Pattern
 */
public class MobileBasedAnimal extends Animal{
	

	/**
	 * @author sruthi
	 * Implemented factory pattern and strategy pattern
	 * @return 
	 *
	 */
	public Animal createAnimalsAndBehavioursSKC(String animalName) {

		Animal a = null;
		
		if (animalName.equals("deer")) {
					a= new Deer();
		}
		else if (animalName.equals("gorilla")) {
			
					a = new Gorilla();
					
		}
		else if(animalName.equals("horse")) {
			
					a = new Horse();
				
		}
		a.setRunBehaviourSKC(new RunWithAimOfPray());
		return a;
	}
	
	
	

	public void run() {
		System.out.println("Run with head Straight");
	}



	
}
