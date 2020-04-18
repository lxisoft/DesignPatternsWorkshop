package com.ayana.animalgame.animal;

public abstract class ColorDecoratorAYN implements AnimalAYN{
	
	protected AnimalAYN decoratedColor;
	
	public ColorDecoratorAYN(AnimalAYN decoratedColor)
	{
		this.decoratedColor = decoratedColor;
	}
	
	public void colorAYN()
	{
		decoratedColor.colorAYN();
	}

}
