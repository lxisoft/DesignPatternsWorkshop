package com.anjali.animalgame.state;

import com.anjali.animalgame.animal.AnimalANJ;

/*
 * Dead State: State pattern
 */
public class DeadState implements StateANJ{

	AnimalANJ animal;
	
	public DeadState(AnimalANJ animal) {
		this.animal = animal;
	}

	@Override
	public void changeStateOfAnimal() {
		this.animal.setAlive(false);
		System.out.println("No more State");
		
	}

}
