package com.anjali.animalgame.animal;

import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;

public abstract class AnimalANJ {
	private String animalName;	
	private Boolean isAlive=true;
	
	/*
	 * Strategy Behaviour Composition
	 */
	protected FoodEatBehaviourANJ foodEatBehaviour; 
	
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
		
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	public FoodEatBehaviourANJ getFoodEatBehaviour() {
		return foodEatBehaviour;
	}

	public void setFoodEatBehaviour(FoodEatBehaviourANJ foodEatBehaviour) {
		this.foodEatBehaviour = foodEatBehaviour;
	}

	public abstract void meetAnotherAnimalANJ(AnimalANJ anotherAnimal);

	public abstract void eat();
	
	public abstract void fight(AnimalANJ animal2);
	
	public abstract void dead();
	
	public abstract void ignore(AnimalANJ animal2);
	
	
}

