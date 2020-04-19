package com.sanjana.AnimalGame.State;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class HungryStateSPM implements StateSPM{

	@Override
	public void updateStateSPM(AnimalSPM animal) {
		// TODO Auto-generated method stub
		System.out.println("animal is very hungry");
		animal.setState(this);
		
	}
	public String toString(){
	      return "Hungry State";
	   }
}
