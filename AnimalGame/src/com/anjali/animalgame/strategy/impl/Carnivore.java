package com.anjali.animalgame.strategy.impl;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;

/*
 * algorithm for Carnivorous
 */
public class Carnivore implements FoodEatBehaviourANJ{

	@Override
	public void eat() {
		System.out.println("Carnivore eat");
	}


}
