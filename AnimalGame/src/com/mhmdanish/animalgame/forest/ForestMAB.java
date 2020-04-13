package com.mhmdanish.animalgame.forest;

import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.DuckAdapterMAB;
import com.mhmdanish.animalgame.animal.DuckMAB;
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
		
		// used decorator pattern
		tiger = new FightableMAB(new TigerMAB());
		lion = new FightableMAB(new LionMAB());
		
		//used adapter pattern
		duck = new DuckAdapterMAB(new DuckMAB());
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
