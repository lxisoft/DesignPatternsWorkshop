package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunBehavior;
import com.sruthy.animalgame.behaviour.RunWithAimOfPray;
import com.sruthy.animalgame.behaviour.RunWithHeadStraight;
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
	
	Deer deerSKC;
	Gorilla gorillaSKC;
	Horse horseSKC;
	
	private RunBehavior runBehaviourSKC;
	
	public MobileBasedAnimal() {
		super();
		setRunBehaviourSKC(new RunWithHeadStraight() );
	}

	
	
	
	/**
	 * @author sruthi
	 * Implemented factory pattern and strategy pattern
	 * @return 
	 *
	 */
	public Animal createAnimalsAndBehavioursSKC(String animalName) {

		switch (animalName) {
		
		case "deer":
					deerSKC = new Deer();
					
					deerSKC.setRunBehaviourSKC(new RunWithAimOfPray());
					
					break;
		case "gorilla":
					gorillaSKC = new Gorilla();
			
					gorillaSKC.setRunBehaviourSKC(new RunWithAimOfPray());
			
					break;
		case "horse":
					horseSKC = new Horse();
			
					horseSKC.setRunBehaviourSKC(new RunWithAimOfPray());
			
					break;

		
		}
		
		return null;
	}
	

	public void run() {
		System.out.println("Run with head Straight");
	}

	public RunBehavior getRunBehaviourSKC() {
		return runBehaviourSKC;
	}


	public void setRunBehaviourSKC(RunBehavior runBehaviourSKC) {
		this.runBehaviourSKC = runBehaviourSKC;
	}


	
}
