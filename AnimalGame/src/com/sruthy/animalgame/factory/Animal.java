package com.sruthy.animalgame.factory;

import com.sruthy.animalgame.behaviour.RunBehavior;

/**
 * @author sruthi
 * 
 * Implemented  Abstract Factory Pattern
 * It acts as an animal abstract factory
 * 
 *
 */
public abstract class Animal{

		public abstract Animal createAnimalsAndBehavioursSKC(String animalName);
		
		private RunBehavior runBehaviourSKC;
		
		public RunBehavior getRunBehaviourSKC() {
			return runBehaviourSKC;
		}
		public void setRunBehaviourSKC(RunBehavior runBehaviourSKC) {
			this.runBehaviourSKC = runBehaviourSKC;
		}
				

}
