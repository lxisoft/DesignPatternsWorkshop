package com.anjali.animalgame.forest;

import com.anjali.animalgame.animal.AnimalANJ;

public class ForestANJ {
	
	public ForestANJ(String forestName) {
		this.forestName = forestName;
	} 
	
	private String forestName;
	
	private AnimalANJ[] animals=new AnimalANJ[10];

	public String getForestName() {
		return forestName;
	}

	public void setForestName(String forestName) {
		this.forestName = forestName;
	}

	public AnimalANJ[] getAnimals() {
		return animals;
	}

	public void setAnimals(AnimalANJ[] animals) {
		this.animals = animals;
	}

	

}
