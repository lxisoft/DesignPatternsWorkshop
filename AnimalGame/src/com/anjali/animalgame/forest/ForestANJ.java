package com.anjali.animalgame.forest;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.facade.AnimalDetailSetterANJ;
import com.anjali.animalgame.facade.IAnimalFacadeANJ;
import com.anjali.animalgame.iterator.AnimalIterator;
import com.anjali.animalgame.iterator.Iterator;

public class ForestANJ {
	
	private static ForestANJ uniqueInstance;  /**
	 											*Singleton pattern implemented-marked constructor as private
	 										   */											 										 
	private ForestANJ() {} 
	
	public static ForestANJ getInstance() {
		if(uniqueInstance==null) {
			uniqueInstance=new ForestANJ();
		}
		return uniqueInstance;
	}
	
	private String forestName;
	
	private String forestRegion;
	
	private AnimalANJ[] animals=new AnimalANJ[10];
	
	

	public String getForestRegion() {
		return forestRegion;
	}

	public void setForestRegion(String forestRegion) {
		this.forestRegion = forestRegion;
	}

	public String getForestName() {
		return forestName;
	}

	public void setForestName(String forestName) {
		this.forestName = forestName;
	}
	                            
	public AnimalANJ[] getAnimals() {			
	  return animals;
	}

	public Iterator createIterator() {			/* Create Iterator instead of invoking getAnimals[] to encapsulate internal code behaviour*/
		return new AnimalIterator(animals);
	}
	
	public void setAnimals(AnimalANJ[] animals) {
		this.animals = animals;
	}

	
	/**
	 * Implemented Facade pattern to avoid the coupling of method calls
	 */	
	public void setAnimalDetails() {
		
		AnimalDetailSetterANJ animalSetter=new AnimalDetailSetterANJ();
	    animalSetter.setAnimalDetails(animals);
		
	}
	
	public void makeAnimalsMeet(AnimalANJ firstAnimal,AnimalANJ secondAnimal) {
		System.out.println("make animals meet");
		firstAnimal.meetAnotherAnimalANJ(secondAnimal);
		
	}

	

}
