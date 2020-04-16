package com.akhil.animalgame.command;

import com.akhil.animalgame.animal.AnimalAKJ;

/**
 * @author Akhil
 * 
 *
 */


public class EatCommandAKJ implements CommandAKJ {

	AnimalAKJ animal;
	
	public EatCommandAKJ(AnimalAKJ animal) {
		this.animal = animal;
	}

	@Override
	public void executeAKJ() {
		animal.eatAKJ();
		
	}

}