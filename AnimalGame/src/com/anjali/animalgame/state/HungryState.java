package com.anjali.animalgame.state;

import com.anjali.animalgame.animal.AnimalANJ;

/*
 * Dead State: State pattern
 */
public class HungryState implements HungerStateANJ{

	AnimalANJ animal;

	public HungryState(AnimalANJ animal) {
		this.animal = animal;
	}

	@Override
	public void kill() {
		System.out.println("kill and eat");
	}

	@Override
	public void ignore() {
		System.out.println("nothing happens");

	}

	
}
