package com.sarath.animalgame.decorator;

import com.sarath.animalgame.animal.AnimalSKS;

public class IotBasedAnimalsDecoratorSKS extends AnimalSKS{
	
	private AnimalSKS animal;
	
	public IotBasedAnimalsDecoratorSKS (AnimalSKS animal) {
		this.animal=animal;
	}
	
	public String eatSKS() {
		return this.animal.eatSKS();
	}

}
