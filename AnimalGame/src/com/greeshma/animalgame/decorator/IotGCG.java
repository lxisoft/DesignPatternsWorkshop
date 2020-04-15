package com.greeshma.animalgame.decorator;

import com.greeshma.animalgame.animal.AnimalGCG;

public class IotGCG extends AnimalGCG {
	AnimalGCG animal;
	
	public IotGCG(AnimalGCG animal) {
		this.animal = animal;
	}
	
	public void eatGCG() {
		iotGCG();
		animal.eatGCG();
	}
	
	public void iotGCG() {
		System.out.print("iot animal ");
	}
}
