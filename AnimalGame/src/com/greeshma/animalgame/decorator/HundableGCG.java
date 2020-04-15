package com.greeshma.animalgame.decorator;

import com.greeshma.animalgame.animal.AnimalGCG;

public class HundableGCG extends AnimalGCG {
	AnimalGCG animal;
	
	public HundableGCG(AnimalGCG animal) {
		this.animal = animal;
	}
	
	public void eatGCG() {
		huntGCG();
		animal.eatGCG();
	}
	
	public void huntGCG() {
		System.out.print("hunt and ");
	}
	
}