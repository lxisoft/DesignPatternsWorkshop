package com.ayana.animalgame.animal;

public class StateContextAYN {
	
	private AnimalAYN state;
	
	public StateContextAYN()
	{
		state = null;
	}
	
	public void setState(AnimalAYN state)
	{
		this.state=state;
	}
	
	public AnimalAYN getState()
	{
		return state;
	}

}
