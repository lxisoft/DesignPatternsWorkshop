package com.anjali.animalgame.animal;

import com.anjali.animalgame.factory.AnimalFactory;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;
import com.anjali.animalgame.strategy.impl.Carnivore;
import com.anjali.animalgame.strategy.impl.Herbivore;
import com.anjali.animalgame.strategy.impl.Omnivore;

public class LionANJ extends AnimalANJ{
	
	
	public void meetAnotherAnimalANJ(AnimalANJ secondAnimal) {
		System.out.println("inside meet*************");
		
		if(secondAnimal.getFoodEatBehaviour() instanceof Herbivore) {
			System.out.println("******lion meet Herbivore"+secondAnimal.getAnimalName());
			checkHungerLevel(secondAnimal);
		}
		else if(secondAnimal.getFoodEatBehaviour() instanceof Carnivore) {
			System.out.println("******lion meet Carnivore"+secondAnimal.getAnimalName());
			
			checkStrengthLevel(secondAnimal);
		}
		else if(secondAnimal.getFoodEatBehaviour() instanceof Omnivore) {
			System.out.println("******lion meet Omnivore"+secondAnimal.getAnimalName());
			
			checkStrengthLevel(secondAnimal);
		}
		else{
			System.out.println("Invalid");	
		}
	}

	
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	
	public void checkStrengthLevel(AnimalANJ animal2){
		System.out.println("Enter Strength Level of "+getAnimalName());
		setStrengthLevel(sc.nextInt());
		System.out.println("Enter Strength Level of "+animal2.getAnimalName());
		animal2.setStrengthLevel(sc.nextInt());
		fight(animal2);
		
		if(getStrengthLevel()>animal2.getStrengthLevel()){
			animal2.dead();
			}
		else if(getStrengthLevel()<animal2.getStrengthLevel()){
			dead();
		}	
		else{
			System.out.println("Animals fight..nobody wins due to same strength level");
		}
		}
		
	public void checkHungerLevel(AnimalANJ animal2){
		System.out.println("enter the Hunger level of "+getAnimalName());
		setHungerLevel(sc.nextInt());
		System.out.println("enter the Hunger level of "+animal2.getAnimalName());
		animal2.setHungerLevel(sc.nextInt());
		 
		if(getHungerLevel()>6){
			this.setState(this.getHungryState());     //state pattern
			state.kill();
			this.eat();          //strategy behaviour invoked
		    animal2.dead();
		}
		else{
			this.setState(this.getNoHungryState());
			state.ignore();
			
		}
	}
	
	public void dead(){
		System.out.println("Lion dies");
		isAlive=false;
	}
	
	
	
}
