package com.anjali.animalgame.state;

/*
 * Alive state : State pattern
 */
import com.anjali.animalgame.animal.AnimalANJ;

public class NoHungerStateANJ implements HungerStateANJ{

	AnimalANJ animal;
	
	public NoHungerStateANJ(AnimalANJ animal) {
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
