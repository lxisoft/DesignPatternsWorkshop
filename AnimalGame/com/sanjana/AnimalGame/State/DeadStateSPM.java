package com.sanjana.AnimalGame.State;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class DeadStateSPM implements StateSPM{

	@Override
	public void updateStateSPM(AnimalSPM animal) {
		// TODO Auto-generated method stub
		System.out.println("animal is dead");
		animal.setState(this);
		
	}
	public String toString(){
	      return "Dead State";
	   }

}
