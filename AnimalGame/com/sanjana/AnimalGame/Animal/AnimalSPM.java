package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public abstract class AnimalSPM{

	// StrengthBehaviour StrengthBehaviour;
	String name;
	EatBehaviourSPM eatBehaviour;
	
	public String getName() {
		return name;
	}
	public abstract String featureSPM();
	public void setEat(){

		eatBehaviour.eat();
	}
	
	public abstract int strengthSPM();

	}