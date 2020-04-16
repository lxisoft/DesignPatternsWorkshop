package com.anjali.animalgame.state;

/*
 * Alive state : State pattern
 */
import com.anjali.animalgame.animal.AnimalANJ;

public class AliveState implements StateANJ{

	AnimalANJ animal;
	
	
	public AliveState(AnimalANJ animal) {
		this.animal = animal;
	}


	@Override
	public void changeStateOfAnimal() {
		System.out.println(this.animal.getAnimalName()+"is dead");
	
		}

}
