package com.neeraja.animalgame.animal.state;

import com.neeraja.animalgame.animal.AnimalNrj;

public class LowEnergyNrj implements StateNrj {
	AnimalNrj animal;
	
	@Override
	public void checkEnergyNrj(AnimalNrj animal) {
		System.out.println("This animal has low Energy");
		animal.setState(this);
	}
	
	public String toString() {
		return "Low energy";
	}
}
