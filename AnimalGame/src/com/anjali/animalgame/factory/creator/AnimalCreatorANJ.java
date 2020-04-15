package com.anjali.animalgame.factory.creator;

import java.util.Scanner;

import com.anjali.animalgame.animal.AnimalANJ;
/*
 * Creator class for factory pattern
 */

public abstract class AnimalCreatorANJ {

	public AnimalANJ getAnimalANJ(String animalType) {
		
		AnimalANJ animal=createAnimal(animalType);
		System.out.println("animalcreater"+animal);
		return animal;
	}
	
	public abstract AnimalANJ createAnimal(String animalType);  /*
	 															*abstract method for creating animal of different type: factory 
	 															*pattern implementation
	 															*/

}
