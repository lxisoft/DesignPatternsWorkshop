package com.sruthy.animalgame.animal;


/**
 * @author sruthi
 * 
 * Implemented  Factory Pattern
 *
 */
public class IOTAnimal extends Animal{
	
	private WhiteTiger whiteTigerSKC;
	private RunBehavior runBehaviourSKC;
	
	public IOTAnimal() {
	
		
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


	public WhiteTiger getWhiteTigerSKC() {
		return whiteTigerSKC;
	}

	public void setWhiteTigerSKC(WhiteTiger whiteTigerSKC) {
		this.whiteTigerSKC = whiteTigerSKC;
	}

	/**
	 * @author sruthi
	 * Implemented factory pattern
	 *
	 */
	public void createAnimalsAndBehavioursSKC() {

		whiteTigerSKC = new WhiteTiger();

		whiteTigerSKC.setRunBehaviourSKC(new RunWithHeadStraight());

		}

}
