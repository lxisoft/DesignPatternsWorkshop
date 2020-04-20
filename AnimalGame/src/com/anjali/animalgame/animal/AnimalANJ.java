package com.anjali.animalgame.animal;

public abstract class AnimalANJ {
	
	private String animalName;

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public abstract void meetAnotherAnimalANJ(AnimalANJ anotherAnimal);

	public abstract void eat();
	
	public abstract void fight(AnimalANJ animal2);
	
	public abstract void dead();
	
	public abstract void ignore(AnimalANJ animal2);
	
}

