package com.mhmdanish.animalgame.forest;

import com.mhmdanish.animalgame.animal.AbstractAnimalFactoryMAB;
import com.mhmdanish.animalgame.animal.AnimalFactoryMAB;
import com.mhmdanish.animalgame.animal.AnimalInvokerMAB;
import com.mhmdanish.animalgame.animal.AnimalIteratorMAB;
import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.CommandMAB;
import com.mhmdanish.animalgame.animal.EatCommandMAB;
import com.mhmdanish.animalgame.animal.FightableAnimalFactoryMAB;
import com.mhmdanish.animalgame.animal.WalkCommandMAB;

/**
 * @author mohammed anish
 * fecade pattern
 * 
 *
 */

public class ForestMAB {
	
	private static volatile ForestMAB instance = null;
	
	AnimalMAB[] animals;
	
	
	private ForestMAB() {
		
	}
	
	
	// singleton pattern
	public static ForestMAB getInstanceMAB() {
		if(instance == null) {
			synchronized(ForestMAB.class) {
				if(instance == null) {
					instance = new ForestMAB();
				}
			}
		}
		
		return instance;
	}
	
	public void createAnimal() {
		
		animals = new AnimalMAB[3];
		
		AbstractAnimalFactoryMAB fightableanimalFactory = new FightableAnimalFactoryMAB();
		AbstractAnimalFactoryMAB animalFactory = new AnimalFactoryMAB();
		
		animals[0] = fightableanimalFactory.createAnimal("tiger");
		animals[1] = fightableanimalFactory.createAnimal("lion");
		
		animals[2] = animalFactory.createAnimal("duck");
	}
	
	public void roamAnimalMAB() {
		
		AnimalIteratorMAB iterator = new AnimalIteratorMAB(animals);
		
		while(iterator.hasNext()) {
			walkMAB(iterator.next());
		}
		
	}
	
	public void eatMAB() {
		AnimalIteratorMAB iterator = new AnimalIteratorMAB(animals);
		
		while(iterator.hasNext()) {
			eatMAB(iterator.next());
		}
	}
	
	private void walkMAB(AnimalMAB animal) {
		CommandMAB animalCommand  = new WalkCommandMAB(animal);
		AnimalInvokerMAB animalInvoker = new AnimalInvokerMAB(animalCommand);
		animalInvoker.executeMAB();
	}
	
	private void eatMAB(AnimalMAB animal) {
		CommandMAB animalCommand  = new EatCommandMAB(animal);
		AnimalInvokerMAB animalInvoker = new AnimalInvokerMAB(animalCommand);
		animalInvoker.executeMAB();
	}
	

}
