package com.jishnu.animalgame.model;

import java.util.ArrayList;
import java.util.List;

public class ForestJI {
	
	List<AnimalJI> animals;
	
	public ForestJI() {
		this.animals = new ArrayList<AnimalJI>();
	}
	
	public List<AnimalJI> getAnimals(){
		return this.animals;
	}
	
	public void setAnimals(List<AnimalJI> animals){
		this.animals = animals;
	}
  
}
