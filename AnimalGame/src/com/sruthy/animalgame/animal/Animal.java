package com.sruthy.animalgame.animal;


/**
 * @author sruthi
 * 
 * Implemented  Strategy Pattern
 *
 */
public class Animal {
	
	private RunBehavior runBehavior;

	
	public RunBehavior getRunBehavior() {
		return runBehavior;
	}

	public void setRunBehavior(RunBehavior runBehavior) {
		this.runBehavior = runBehavior;
	}


	public void performRun() {
		runBehavior.run();
	}
	

	public void eatSKC() {
		System.out.println("Eating");
	}

	public void walkSKC() {
		System.out.println("walking");
	}

}
	

