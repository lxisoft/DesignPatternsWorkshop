package com.anjali.animalgame.animal;

import java.util.Scanner;

public abstract class AnimalANJ {
	
	private String animalName;

	private boolean isAlive=true;
	
	private int hungerLevel;
	
	private int strengthLevel;
	
	public Scanner sc=new Scanner(System.in);
	
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public int getHungerLevel() {
		return hungerLevel;
	}

	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
	}

	public int getStrengthLevel() {
		return strengthLevel;
	}

	public void setStrengthLevel(int strengthLevel) {
		this.strengthLevel = strengthLevel;
	}

	public abstract void meetAnotherAnimalANJ(AnimalANJ anotherAnimal);

	public void fight(AnimalANJ animal2){
		System.out.println(animalName+" fights with "+animal2.getAnimalName());	
	}
	
	public void dead(){
		System.out.println(getAnimalName()+" dies");
		isAlive=false;
		
	}
	
	public void ignore(AnimalANJ animal2){
		if((animal2 instanceof Carnivorous)||(animal2 instanceof Omnivorous)){
		System.out.println(animal2.getAnimalName()+" ignores "+getAnimalName());
			
		}
		else{
		System.out.println(getAnimalName()+" ignores "+animal2.getAnimalName());
		}
	}
}
