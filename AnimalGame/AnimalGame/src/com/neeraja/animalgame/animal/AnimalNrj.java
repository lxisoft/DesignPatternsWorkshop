package com.neeraja.animalgame.animal;

import com.neeraja.animalgame.animal.behavior.EatBehaviourNrj;
import com.neeraja.animalgame.animal.state.StateNrj;

public abstract class AnimalNrj {
	String name;
	
	EatBehaviourNrj eatBehaviourNrj;
	
	//StatePattern
	StateNrj state;
	
	public StateNrj getState() {
		return state;
	}


	public void setState(StateNrj state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}

	
	public void setEatNrj(){

		eatBehaviourNrj.eatNrj();
	}

	public void eatNrj() {
		System.out.println("Eating");
	}

	public void walkNrj() {
		System.out.println("walking");
	}
	
	//template pattern
	
	public abstract void fight();
	public abstract void rest();
	public void performAction() {
		
		fight();
		rest();
	}
}
