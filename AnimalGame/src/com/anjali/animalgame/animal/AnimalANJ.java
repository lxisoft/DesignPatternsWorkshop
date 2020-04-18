package com.anjali.animalgame.animal;

import java.util.Scanner;

import com.anjali.animalgame.state.AliveState;
import com.anjali.animalgame.state.DeadState;
import com.anjali.animalgame.state.StateANJ;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;
/*
 * Context class for Strategy and State pattern
 */
public abstract class AnimalANJ {
	
	private String animalName;

	private boolean isAlive=true;
	
	private int hungerLevel;

	private int strengthLevel;
	
	/*
	 * Strategy Behaviour Composition
	 */
	protected FoodEatBehaviourANJ foodEatBehaviour; 
	
	protected Scanner sc=new Scanner(System.in);
	
	/*
	 * State Composition in context class. Two states of animal: alive and dead  : State pattern
	 * 
	 */
	private StateANJ aliveState;

	private StateANJ deadState;
	
	StateANJ state=aliveState;
	/*
	 * Setting state via constructor 
	 */
	public AnimalANJ() {
		aliveState = new AliveState(this);
		deadState = new DeadState(this);
	}
	
	/*
	 * Template method
	 */
	public final void templateMethod(AnimalANJ anotherAnimal) {	
		meetAnotherAnimalANJ(anotherAnimal);				//abstract template method. It is implemented in the subclasses
		eat();					
		fight(anotherAnimal);		/* 
		 							concrete methods*/
		dead();
		ignore(anotherAnimal);
	
	}
	
	public FoodEatBehaviourANJ getFoodEatBehaviour() {
		return foodEatBehaviour;
	}

	/*
	 * Strategy Behaviour setter for changing behaviour dynamically
	 */
	public void setFoodEatBehaviour(FoodEatBehaviourANJ foodEatBehaviour) {
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
	
	public StateANJ getAliveState() {
		return aliveState;
	}

	public void setAliveState(StateANJ aliveState) {
		this.aliveState = aliveState;
	}

	public StateANJ getDeadState() {
		return deadState;
	}

	public void setDeadState(StateANJ deadState) {
		this.deadState = deadState;
	}
	
	public void setState(StateANJ state) {
		this.state = state;
	}

	public abstract void meetAnotherAnimalANJ(AnimalANJ anotherAnimal);

	public void eat() {
		foodEatBehaviour.eat();
	}
	
	public void fight(AnimalANJ animal2){
		System.out.println(animalName+" fights with "+animal2.getAnimalName());	
	}
	
	/*
	 * Changing the animal state after death : State pattern
	 */
	public void dead(){
		System.out.println("dead method state changed");
		System.out.println(getAnimalName()+" dies");
		this.setState(this.getDeadState());
		state.changeStateOfAnimal();
		
	}
	
	public void ignore(AnimalANJ animal2){
		System.out.println(getAnimalName()+" ignores "+animal2.getAnimalName());
	}
}

