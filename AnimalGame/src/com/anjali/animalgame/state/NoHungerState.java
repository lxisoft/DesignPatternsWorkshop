package com.anjali.animalgame.state;

/*
 * Alive state : State pattern
 */
import com.anjali.animalgame.animal.AnimalANJ;

public class NoHungerState implements HungerStateANJ{

	AnimalANJ animal;
	
	public NoHungerState(AnimalANJ animal) {
		this.animal = animal;
	}

	@Override
	public void kill() {
		System.out.println("nothing happens");
	}

	@Override
	public void ignore() {
		System.out.println("ignore animal");
	}
	
	
	
}
