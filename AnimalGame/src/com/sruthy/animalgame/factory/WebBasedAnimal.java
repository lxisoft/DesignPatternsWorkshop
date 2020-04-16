package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunBehavior;
import com.sruthy.animalgame.behaviour.RunWithAimOfPray;
import com.sruthy.animalgame.webbasedanimal.Bear;
import com.sruthy.animalgame.webbasedanimal.Dog;
import com.sruthy.animalgame.webbasedanimal.Elephant;

/**
 * @author sruthi
 * 
 * Implemented Factory Pattern, Strategy Pattern
 * 
 *
 */
public class WebBasedAnimal extends Animal{
	
	Bear bearSKC;
	Dog dogSKC;
	Elephant elephantSKC;

	
	private RunBehavior runBehaviorSKC; 
	
	public WebBasedAnimal() {
		super();
		setRunBehaviorSKC(new RunWithAimOfPray() );
	}
	
	

	/**
	 * @author sruthi
	 * Implemented factory pattern and strategy pattern
	 *
	 */
	public Animal createAnimalsAndBehavioursSKC(String animalName) {

		switch (animalName) {
		
		case "bear":
					bearSKC = new Bear();
			
					bearSKC.setRunBehaviorSKC(new RunWithAimOfPray());
			
					break;
		case "dog":
					dogSKC = new Dog();
			
					dogSKC.setRunBehaviorSKC(new RunWithAimOfPray());
			
					break;
		case "elephant":
					elephantSKC = new Elephant();
			
					elephantSKC.setRunBehaviorSKC(new RunWithAimOfPray());
			
					break;

		
		}
		return null;
		
	}
	

		public void run() {
			System.out.println("Run with Aim Of Pray");
		}


		public RunBehavior getRunBehaviorSKC() {
			return runBehaviorSKC;
		}


		public void setRunBehaviorSKC(RunBehavior runBehaviorSKC) {
			this.runBehaviorSKC = runBehaviorSKC;
		}
		
		
		
		
}



