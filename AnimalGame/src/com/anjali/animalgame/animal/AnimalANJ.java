package com.anjali.animalgame.animal;

import java.util.Scanner;

import com.anjali.animalgame.state.HungerStateANJ;
import com.anjali.animalgame.state.HungryState;
import com.anjali.animalgame.state.NoHungerStateANJ;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;

public abstract class AnimalANJ {
	protected String animalName;	
	protected Boolean isAlive=true;
	protected int hungerLevel;
	protected int strengthLevel;
	protected Scanner sc=new Scanner(System.in);
	
	/*
	 * State Composition in context class. Two states of animal: alive and dead  : State pattern
	 * 
	 */
	protected HungerStateANJ hungryState;

	protected NoHungerStateANJ noHungryState;
	
	HungerStateANJ state;
	/*
	 * Setting state via constructor 
	 */
	public AnimalANJ() {
		hungryState = new HungryState(this);
		noHungryState = new NoHungerStateANJ(this);
	}
	
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

	public FoodEatBehaviourANJ getFoodEatBehaviour() {
		return foodEatBehaviour;
	}

	public void setFoodEatBehaviour(FoodEatBehaviourANJ foodEatBehaviour) {
		this.foodEatBehaviour = foodEatBehaviour;
	}

	
	public HungerStateANJ getHungryState() {
		return hungryState;
	}

	public void setHungryState(HungerStateANJ hungryState) {
		this.hungryState = hungryState;
	}

	public NoHungerStateANJ getNoHungryState() {
		return noHungryState;
	}

	public void setNoHungryState(NoHungerStateANJ noHungryState) {
		this.noHungryState = noHungryState;
	}

	public HungerStateANJ getState() {
		return state;
	}

	public void setState(HungerStateANJ state) {
		this.state = state;
	}
	
	public abstract void meetAnotherAnimalANJ(AnimalANJ anotherAnimal);

	public void eat() {
		foodEatBehaviour.eat();
	}
	
	public void fight(AnimalANJ animal2){
		System.out.println(animalName+" fights with "+animal2.getAnimalName());	
	}
	
	public abstract void dead(); 
	
	public void ignore(AnimalANJ animal2){
		System.out.println(getAnimalName()+" ignores "+animal2.getAnimalName());
	}
	
}

