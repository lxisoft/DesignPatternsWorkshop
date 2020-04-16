package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunBehavior;
import com.sruthy.animalgame.behaviour.RunWithAimOfPray;
import com.sruthy.animalgame.iotanimal.Lion;
import com.sruthy.animalgame.iotanimal.Monkey;
import com.sruthy.animalgame.iotanimal.Tiger;

/**
 * @author sruthi
 * 
 * Implemented  Factory Pattern
 *
 */
public class IOTAnimal extends Animal{
	
	Lion lionSKC;
	Monkey monkeySKC;
	Tiger tigerSKC;
	
	
	private RunBehavior runBehaviourSKC;
	
	public IOTAnimal() {
		super();
		setRunBehaviourSKC(new RunWithAimOfPray() );
	}

	public void eat() {
		
	}


	/**
	 * @author sruthi
	 * Implemented factory pattern and strategy pattern
	 *
	 */
	public Animal createAnimalsAndBehavioursSKC(String animalName) {

		if (animalName.equals("lion")) {
		
		
					lionSKC = new Lion();
			
					lionSKC.setRunBehaviourSKC(new RunWithAimOfPray());
					
					return lionSKC;
					
		}
		else if (animalName.equals("monkey")) {
			
					monkeySKC = new Monkey();
			
					monkeySKC.setRunBehaviourSKC(new RunWithAimOfPray());
					return monkeySKC;
		}
		else if(animalName.equals("tiger")) {
			
					tigerSKC = new Tiger();
			
					tigerSKC.setRunBehaviourSKC(new RunWithAimOfPray());
			
					return tigerSKC;
		
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
