package com.anjali.animalgame.strategy.impl;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.strategy.IFoodEatBehaviourANJ;

/*
 * algorithm for Carnivorous and Omnivoroes type
 */
public class HuntFood implements IFoodEatBehaviourANJ{

	@Override
	public void foodHunt() {
		this.hunt();
	}
	
	public void hunt() {
		System.out.println("hunt for food");
	}


}
