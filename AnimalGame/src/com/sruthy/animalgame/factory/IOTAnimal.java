package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunWithAimOfPray;
import com.sruthy.animalgame.iotanimal.Lion;
import com.sruthy.animalgame.iotanimal.Cheetah;
import com.sruthy.animalgame.iotanimal.Tiger;

/**
 * @author sruthi
 * 
 * Implemented  Factory Pattern, Strategy Pattern
 * Implemented Template Pattern
 *
 */
public class IOTAnimal extends Animal{

	/**
	 * @author sruthi
	 * Implemented factory pattern and strategy pattern
	 *
	 */
	public Animal createAnimalsAndBehavioursSKC(String animalName) {

		Animal a = null;
		
		if (animalName.equals("lion")) {
					
					a= new Lion();
		}
		else if (animalName.equals("monkey")) {
			
					a = new Cheetah();
			
		}
		else if(animalName.equals("tiger")) {
			
					a = new Tiger();
			
		}
		 a.setRunBehaviourSKC(new RunWithAimOfPray());
		 return a;
	}
	
	
		
	public void run() {
		System.out.println("Run with head Straight");
	}


	public void eat() {
		
	}
}
