package com.anjali.animalgame.animal;

import com.anjali.animalgame.factory.AnimalFactory;
import com.anjali.animalgame.observer.DangerSubject;
import com.anjali.animalgame.observer.Observer;
import com.anjali.animalgame.observer.Subject;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;
import com.anjali.animalgame.strategy.impl.Carnivore;
import com.anjali.animalgame.strategy.impl.Herbivore;
import com.anjali.animalgame.strategy.impl.Omnivore;

/*
 * Observer class observing DangerSubject
 */
public class RabbitANJ extends AnimalANJ /*implements Observer*/{
	
	/*
	 * Strategy Behaviour Composition
	 */
	protected FoodEatBehaviourANJ foodEatBehaviour; 

	public RabbitANJ() {
		foodEatBehaviour=new Herbivore();
	}
	
	@Override
public void meetAnotherAnimalANJ(AnimalANJ animal2) {
		
		if(animal2.getFoodEatBehaviour() instanceof Carnivore){
			System.out.println("observer rabbit");
		//	notifyDanger();
			//run(animal2);
			}
			else if(animal2.getFoodEatBehaviour() instanceof Omnivore){
				System.out.println("observer rabbit");
			}
			else if(animal2.getFoodEatBehaviour() instanceof Herbivore){
			ignore(animal2);
			}
			
			else{
				System.out.println("Not valid");
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
