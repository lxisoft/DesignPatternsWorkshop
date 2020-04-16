package com.sarath.animalgame.decorator;

import com.sarath.animalgame.animal.AnimalSKS;

public class MobileBasedAnimalsDecoratorSKS extends AnimalSKS{
	
	private AnimalSKS animal;
	
	public MobileBasedAnimalsDecoratorSKS (AnimalSKS animal) {
		this.animal=animal;
	}
	
	public String eatSKS() {
		return this.animal.eatSKS();
	}

}