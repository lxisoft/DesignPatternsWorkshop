package com.sanjana.AnimalGame.State;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

public class TiredStateSPM implements StateSPM{

	@Override
	public void updateStateSPM(AnimalSPM animal) {
		// TODO Auto-generated method stub
		System.out.println("animal is tired");
		animal.setState(this);
		
	}
	public String toString(){
	      return "Tired State";
	   }

}
