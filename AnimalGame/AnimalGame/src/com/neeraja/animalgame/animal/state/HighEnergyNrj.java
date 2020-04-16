package com.neeraja.animalgame.animal.state;

import com.neeraja.animalgame.animal.AnimalNrj;

public class HighEnergyNrj implements StateNrj {
	
	AnimalNrj animal;

	@Override
	public void checkEnergyNrj(AnimalNrj animal) {
		System.out.println("This animal has high Energy");
		animal.setState(this);
	}
	
	public String toString() {
		return "High energy";
	}

}
