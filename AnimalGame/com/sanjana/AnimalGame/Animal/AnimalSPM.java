package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.State.FightStateSPM;
import com.sanjana.AnimalGame.State.StateSPM;
/**
 * @author sanjana p
 *
 */
public abstract class AnimalSPM{
private StateSPM state;
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
	
	public void setState(StateSPM state) {
		// TODO Auto-generated method stub
		this.state = state;
		
	}
	
	public 	StateSPM getState() {
		return state;
	}

	}

