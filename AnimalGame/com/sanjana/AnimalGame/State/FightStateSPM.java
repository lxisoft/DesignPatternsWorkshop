package com.sanjana.AnimalGame.State;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class FightStateSPM implements StateSPM{
	
	//singleton

	@Override
	public void updateStateSPM(AnimalSPM animal) {
		// TODO Auto-generated method stub
		System.out.println("animal is ready to fight");
	      animal.setState(this);
		
	}
	public String toString(){
	      return "Ready State";
	   }
}
