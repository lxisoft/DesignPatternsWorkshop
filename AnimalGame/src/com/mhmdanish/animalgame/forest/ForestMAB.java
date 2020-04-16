package com.mhmdanish.animalgame.forest;

import java.io.IOException;

import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.command.AnimalInvokerMAB;
import com.mhmdanish.animalgame.command.CommandMAB;
import com.mhmdanish.animalgame.command.EatCommandMAB;
import com.mhmdanish.animalgame.command.WalkCommandMAB;
import com.mhmdanish.animalgame.config.AnimalTypeConfigMAB;
import com.mhmdanish.animalgame.decorator.WebAnimalMAB;
import com.mhmdanish.animalgame.factory.AbstractAnimalFactoryMAB;
import com.mhmdanish.animalgame.factory.AnimalFactoryMAB;
import com.mhmdanish.animalgame.factory.FightableAnimalFactoryMAB;
import com.mhmdanish.animalgame.factory.IOTAnimalFactoryMAB;
import com.mhmdanish.animalgame.factory.MobileAnimalFactoryMAB;
import com.mhmdanish.animalgame.factory.WebAnimalFactoryMAB;
import com.mhmdanish.animalgame.iterator.AnimalIteratorMAB;

/**
 * @author mohammed anish
 * fecade pattern
 * singleton pattern
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
		String type = null;
		try {
			type =new AnimalTypeConfigMAB().getTypeMAB();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		animals = new AnimalMAB[6];
		
		if(type.equals("iot")) {
			AbstractAnimalFactoryMAB animalFactory = new IOTAnimalFactoryMAB();
			animals[0] = animalFactory.createAnimal("tiger");
			animals[1] = animalFactory.createAnimal("lion");
			animals[2] = animalFactory.createAnimal("duck");
		} else if(type.equals("web")) {
			AbstractAnimalFactoryMAB animalFactory = new WebAnimalFactoryMAB();
			animals[0] = animalFactory.createAnimal("tiger");
			animals[1] = animalFactory.createAnimal("lion");
			animals[2] = animalFactory.createAnimal("duck");
		} else if(type.equals("mobile")) {
			AbstractAnimalFactoryMAB animalFactory = new MobileAnimalFactoryMAB();
			animals[0] = animalFactory.createAnimal("tiger");
			animals[1] = animalFactory.createAnimal("lion");
			animals[2] = animalFactory.createAnimal("duck");
		}
			
		AbstractAnimalFactoryMAB fightableanimalFactory = new FightableAnimalFactoryMAB();
		AbstractAnimalFactoryMAB animalFactory = new AnimalFactoryMAB();
		
		animals[3] = fightableanimalFactory.createAnimal("tiger");
		animals[4] = fightableanimalFactory.createAnimal("lion");
		animals[5] = animalFactory.createAnimal("duck");
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
