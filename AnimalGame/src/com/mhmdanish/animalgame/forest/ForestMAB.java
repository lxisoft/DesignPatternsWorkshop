package com.mhmdanish.animalgame.forest;

import com.mhmdanish.animalgame.animal.AbstractAnimalFactoryMAB;
import com.mhmdanish.animalgame.animal.AnimalFactoryMAB;
import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.DuckAdapterMAB;
import com.mhmdanish.animalgame.animal.DuckMAB;
import com.mhmdanish.animalgame.animal.FightableAnimalFactoryMAB;
import com.mhmdanish.animalgame.animal.FightableMAB;
import com.mhmdanish.animalgame.animal.LionMAB;
import com.mhmdanish.animalgame.animal.TigerMAB;

public class ForestMAB {
	
	private static volatile ForestMAB instance = null;
	
	AnimalMAB tiger;
	AnimalMAB lion;
	AnimalMAB duck;
	
	
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
		
		
		//animal factory for creating fightable animal
		AbstractAnimalFactoryMAB fightableanimalFactory = new FightableAnimalFactoryMAB();
		
		//animal factory for creating animal
		AbstractAnimalFactoryMAB animalFactory = new AnimalFactoryMAB();
		
		
		// used decorator pattern
		tiger = fightableanimalFactory.createAnimal("tiger");
		lion = fightableanimalFactory.createAnimal("lion");
		
		//used adapter pattern
		duck = animalFactory.createAnimal("duck");
	}
	
	public void roamAnimalMAB() {
		
		walkMAB(tiger);
		walkMAB(lion);
		walkMAB(duck);
	}
	
	public void fight() {
	}
	
	private void walkMAB(AnimalMAB animal) {
		animal.walkMAB();
	}
	

}
