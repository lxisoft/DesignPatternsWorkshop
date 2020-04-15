package com.anjali.animalgame.animal;

import com.anjali.animalgame.strategy.impl.GrazeFood;
import com.anjali.animalgame.strategy.impl.HuntFood;

public class RabbitANJ extends AnimalANJ {

	
	public RabbitANJ() {
		foodEatBehaviour=new GrazeFood(); //setting strategy pattern behaviour
	}

	@Override
	public void meetAnotherAnimalANJ(AnimalANJ animal2) {
		
		if(animal2.getFoodEatBehaviour() instanceof HuntFood){
			run(animal2);
			}
			
			else if(animal2.getFoodEatBehaviour() instanceof GrazeFood){
			ignore(animal2);
			}
			
			else{
				System.out.println("Not valid");
			}
		
	}

	
	public void graze() {
		this.foodHunt();		//strategy behaviour invoked 	
	}
	
	public void run(AnimalANJ animal){
		System.out.println(getAnimalName()+" Runs meeting "+animal.getAnimalName());
		
	}

}
