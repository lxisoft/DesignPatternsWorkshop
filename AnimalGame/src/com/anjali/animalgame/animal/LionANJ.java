package com.anjali.animalgame.animal;

import com.anjali.animalgame.factory.AnimalFactory;
import com.anjali.animalgame.strategy.impl.Carnivore;

public class LionANJ extends AnimalANJ{
	
	AnimalFactory factory;

	public LionANJ(AnimalFactory factory) {
		this.factory = factory;
	}

	public LionANJ() {
		foodEatBehaviour=new Carnivore(); //setting strategy pattern behaviour
	}

	@Override
	public void meetAnotherAnimalANJ(AnimalANJ animal2) {

		/*System.out.println(animal2.getFoodEatBehaviour());
		if(animal2.getFoodEatBehaviour() instanceof GrazeFood) {
			
			System.out.println("******lion meet graze food"+animal2.getAnimalName());
			
			checkHungerLevel(animal2);
		}
		else if(animal2.getFoodEatBehaviour() instanceof HuntFood) {
			System.out.println("******lion meet hunt food"+animal2.getAnimalName());
			
			checkStrengthLevel(animal2);
		}
		else{
			System.out.println("Invalid");	
		}*/
		
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
			this.eat();       //strategy behaviour invoked
		    animal2.dead();
		}
		else{
			ignore(animal2);
			
		}
	}
	
	

}
