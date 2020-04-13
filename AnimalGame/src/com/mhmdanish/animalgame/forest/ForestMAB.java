package com.mhmdanish.animalgame.forest;

import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.DuckAdapterMAB;
import com.mhmdanish.animalgame.animal.DuckMAB;
import com.mhmdanish.animalgame.animal.LionMAB;
import com.mhmdanish.animalgame.animal.TigerMAB;

public class ForestMAB {
	
	private static volatile ForestMAB instance = null;
	
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
	
	public void roarAnimal() {
		AnimalMAB tiger = new TigerMAB();
		AnimalMAB lion = new LionMAB();
		AnimalMAB duck = new DuckAdapterMAB(new DuckMAB());
		walk(tiger);
		walk(lion);
		walk(duck);
	}
	
	private void walk(AnimalMAB animal) {
		animal.walk();
	}
	

}
