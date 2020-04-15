package com.anjali.animalgame.strategy.impl;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.strategy.IFoodEatBehaviourANJ;

/*
 * algorithm for Herbivorous type
 */
public class GrazeFood implements IFoodEatBehaviourANJ{

	@Override
	public void foodHunt() {
		this.graze();
	}
	
	public void graze() {
		System.out.println("Graze for food");
	}

}
