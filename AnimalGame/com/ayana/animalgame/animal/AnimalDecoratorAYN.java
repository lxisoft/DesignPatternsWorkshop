package com.ayana.animalgame.animal;

public abstract class AnimalDecoratorAYN implements AnimalAYN{
	
	protected AnimalAYN decoratedAnimal;
	
	public AnimalDecoratorAYN(AnimalAYN decoratedAnimal)
	{
		this.decoratedAnimal=decoratedAnimal;
	}

	public void colorAYN()
	{
		//decoratedAnimal.colorAYN();
	}
}
