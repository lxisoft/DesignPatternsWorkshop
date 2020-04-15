package com.greeshma.animalgame.decorator;

import com.greeshma.animalgame.animal.AnimalGCG;

public class WebGCG extends AnimalGCG{
AnimalGCG animal;
	
	public WebGCG(AnimalGCG animal) {
		this.animal = animal;
	}
	
	public void eatGCG() {
		webGCG();
		animal.eatGCG();
	}
	
	public void webGCG() {
		System.out.print("web animal ");
	}
}
