package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.State.FightStateSPM;
import com.sanjana.AnimalGame.State.StateSPM;
/**
 * @author sanjana p
 *
 */
public abstract class AnimalSPM{
private StateSPM state;
	// StrengthBehaviour StrengthBehaviour;
	AnimalSPM name;
	int locationX;
	int locationY;
	EatBehaviourSPM eatBehaviour;
	
	public void setName(AnimalSPM animalSPM)
	{
		this.name=animalSPM;
	}
	public AnimalSPM getName() {
		return name;
	}
	public abstract String featureSPM();
	public void setEat(){

		eatBehaviour.eat();
	}
	
	public abstract int strengthSPM();
	
	public void setState(StateSPM state) {
		// TODO Auto-generated method stub
		this.state = state;
		
	}
	
	public 	StateSPM getState() {
		return state;
	}
	
	public void setLocationX(int locationX)
	{
		this.locationX=locationX;
	}
	public void setLocationY(int locationY)
	{
		this.locationY=locationY;
	}
	public int getLocationX()
	{
		return locationX;
	}
	public int getLocationY()
	{
		return locationY;
	}
	
	

	}

