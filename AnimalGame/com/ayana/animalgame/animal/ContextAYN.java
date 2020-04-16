package com.ayana.animalgame.animal;

public class ContextAYN {
	
	private AnimalAYN animal;
	
	public ContextAYN(AnimalAYN animal)
	{
		this.animal = animal;
	}
	
	public int executeStrategyAYN(int initialSpeed)
	{
		return animal.speedAYN(initialSpeed);
	}

}
