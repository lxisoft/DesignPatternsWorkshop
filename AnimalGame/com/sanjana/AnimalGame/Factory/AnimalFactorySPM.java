package com.sanjana.AnimalGame.Factory;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

import com.sanjana.AnimalGame.Forest.ForestSPM;
import com.sanjana.AnimalGame.State.StateSPM;

/**
 * @author sanjana p
 *
 */

public abstract class AnimalFactorySPM {
	String name;
	StateSPM state;
	
	public abstract AnimalSPM getAnimalSPM(String type);

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setState(StateSPM state) {
		// TODO Auto-generated method stub
		this.state = state;
		
	}
	
	public 	StateSPM getState() {
		return state;
	}
	
	
	
}