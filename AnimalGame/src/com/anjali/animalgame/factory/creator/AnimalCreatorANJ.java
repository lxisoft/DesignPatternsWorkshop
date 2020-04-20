package com.anjali.animalgame.factory.creator;

import java.util.Scanner;

import com.anjali.animalgame.animal.AnimalANJ;
/*
 * Creator class for factory pattern with template method
 */

public abstract class AnimalCreatorANJ {

	public AnimalANJ create(String animalType) {
		
		AnimalANJ animal=createAnimal(animalType);
		return animal;
	}
	
	public abstract AnimalANJ createAnimal(String animalType);  /*
	 															*abstract method for creating animal of different type: factory 
	 															*pattern implementation
	 															*/

}
