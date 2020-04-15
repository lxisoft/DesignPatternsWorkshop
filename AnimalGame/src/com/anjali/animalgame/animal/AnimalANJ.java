package com.anjali.animalgame.animal;

import java.util.Scanner;

import com.anjali.animalgame.strategy.IFoodEatBehaviourANJ;

public abstract class AnimalANJ {
	
	private String animalName;

	private boolean isAlive=true;
	
	private int hungerLevel;

	private int strengthLevel;
	
	protected IFoodEatBehaviourANJ foodEatBehaviour; //strategy behaviour interface
	
	public Scanner sc=new Scanner(System.in);
	
	public IFoodEatBehaviourANJ getFoodEatBehaviour() {
		return foodEatBehaviour;
	}

	public void setFoodEatBehaviour(IFoodEatBehaviourANJ foodEatBehaviour) {
		this.foodEatBehaviour = foodEatBehaviour;
	}
	
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

	public void foodHunt() {
		foodEatBehaviour.foodHunt();
	}
	
	public void fight(AnimalANJ animal2){
		System.out.println(animalName+" fights with "+animal2.getAnimalName());	
	}
	
	public void dead(){
		System.out.println(getAnimalName()+" dies");
		isAlive=false;
		
	}
	
	public void ignore(AnimalANJ animal2){
		System.out.println(getAnimalName()+" ignores "+animal2.getAnimalName());
	}
}
