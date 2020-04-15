package com.greeshma.animalgame.decorator;

import com.greeshma.animalgame.animal.AnimalGCG;

public class MobileGCG extends AnimalGCG{
	AnimalGCG animal;
	
	public MobileGCG(AnimalGCG animal) {
		this.animal = animal;
	}
	
	public void eatGCG() {
		mobileGCG();
		animal.eatGCG();
	}
	
	public void mobileGCG() {
		System.out.print("mobile and ");
	}
}
