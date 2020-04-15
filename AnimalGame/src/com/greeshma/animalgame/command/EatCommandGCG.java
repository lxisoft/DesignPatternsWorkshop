package com.greeshma.animalgame.command;

import com.greeshma.animalgame.animal.AnimalGCG;

public class EatCommandGCG implements CommandGCG {
	
	AnimalGCG animal;
	
	public EatCommandGCG(AnimalGCG animal) {
		this.animal = animal;
	}

	@Override
	public void executeGCG() {
		animal.eatGCG();

	}

}
