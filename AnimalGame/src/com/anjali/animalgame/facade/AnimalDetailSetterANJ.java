package com.anjali.animalgame.facade;

import com.anjali.animalgame.animal.AnimalANJ;

/*
 * Facade implemented class setting animal names
 */
public class AnimalDetailSetterANJ implements IAnimalFacadeANJ{

	@Override
	public void setAnimalDetails(AnimalANJ[] animals) {
		System.out.println("inside setAnimalDetails in facade implemented class");
		
		animals[0].setAnimalName("Deer 1");
		animals[1].setAnimalName("Deer 2");
		animals[2].setAnimalName("Deer 3");
		animals[3].setAnimalName("Deer 4");
		animals[4].setAnimalName("Lion 1");
		animals[5].setAnimalName("Tiger 1");
		animals[6].setAnimalName("Tiger 2");
		animals[7].setAnimalName("Bear 1");
		animals[8].setAnimalName("Rabbit 1");
		animals[9].setAnimalName("Rabbit 1");
		
	}

	
}
