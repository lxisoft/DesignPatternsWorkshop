package com.sarath.animalgame.decorator;

import com.sarath.animalgame.animal.AnimalSKS;

public class WebBasedAnimalsDecoratorSKS extends AnimalSKS{
	
	private AnimalSKS animal;
	
	public WebBasedAnimalsDecoratorSKS (AnimalSKS animal) {
		this.animal=animal;
	}
	
	public String eatSKS() {
		return this.animal.eatSKS();
	}

}
