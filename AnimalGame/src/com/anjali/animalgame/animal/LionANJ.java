package com.anjali.animalgame.animal;

import com.anjali.animalgame.factory.AnimalFactory;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;
import com.anjali.animalgame.strategy.impl.Carnivore;
import com.anjali.animalgame.strategy.impl.Herbivore;
import com.anjali.animalgame.strategy.impl.Omnivore;

public class LionANJ extends AnimalANJ{
	
	@Override
	public void meetAnotherAnimalANJ(AnimalANJ secondAnimal) {
		System.out.println("inside meet*************");
		
		if(secondAnimal.getFoodEatBehaviour() instanceof Herbivore) {
			System.out.println("******lion meet Herbivore"+secondAnimal.getAnimalName());
		//	checkHungerLevel(secondAnimal);
		}
		else if(secondAnimal.getFoodEatBehaviour() instanceof Carnivore) {
			System.out.println("******lion meet Carnivore"+secondAnimal.getAnimalName());
			
			//checkStrengthLevel(secondAnimal);
		}
		else if(secondAnimal.getFoodEatBehaviour() instanceof Omnivore) {
			System.out.println("******lion meet Omnivore"+secondAnimal.getAnimalName());
			
			//checkStrengthLevel(secondAnimal);
		}
		else{
			System.out.println("Invalid");	
		}
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight(AnimalANJ animal2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ignore(AnimalANJ animal2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
