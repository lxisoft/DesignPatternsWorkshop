package com.sruthy.animalgame.animal;


/**
 * @author sruthi
 * 
 * Implemented Factory Pattern
 *
 */
public class WebBasedAnimal extends Animal{

	private BengalTiger bengalTigerSKC;
	private RunBehavior runBehaviorSKC; 
	
	public void run() {
		System.out.println("Run with Aim Of Pray");
	}
	
	public RunBehavior getRunBehaviorSKC() {
		return runBehaviorSKC;
	}


	public void setRunBehaviorSKC(RunBehavior runBehaviorSKC) {
		this.runBehaviorSKC = runBehaviorSKC;
	}


	public BengalTiger getBengalTigerSKC() {
		return bengalTigerSKC;
	}


	public void setBengalTigerSKC(BengalTiger bengalTigerSKC) {
		this.bengalTigerSKC = bengalTigerSKC;
	}


	/**
	 * @author sruthi
	 * Implemented factory pattern
	 *
	 */
	public void createAnimalsAndBehavioursSKC() {

		bengalTigerSKC = new BengalTiger();

		bengalTigerSKC.setRunBehaviorSKC(new RunWithAimOfPray());

	}
	

}
