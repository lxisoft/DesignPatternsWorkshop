package com.neeraja.animalgame.animal.animaltype;

import com.neeraja.animalgame.animal.AnimalNrj;

public class MobileAnimalNrj extends AnimalNrj {

	AnimalNrj animal;
	public MobileAnimalNrj(AnimalNrj animal) {
		System.out.println(">>>>>>>>>>> mobileAnimalNrj");
		
		this.animal=animal;
		
	}
	public String toString() {
		return animal.toString();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rest() {
		// TODO Auto-generated method stub
		
	}

	
}
