package com.ayana.animalgame.animal;

public class StrategyAYN {
	
	private AnimalAYN strategy;
	
	public StrategyAYN(AnimalAYN strategy)
	{
		this.strategy=strategy;
	}

	public int executeStrategyAYN(int initialSpeed)
	{
		return strategy.speedAYN(initialSpeed);
	}
}
