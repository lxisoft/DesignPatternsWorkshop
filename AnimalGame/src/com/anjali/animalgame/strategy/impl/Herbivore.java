package com.anjali.animalgame.strategy.impl;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;

/*
 * algorithm for Herbivorous type
 */
public class Herbivore implements FoodEatBehaviourANJ{

	@Override
	public void eat() {

		System.out.println("Herbivore eat");
	}

}
