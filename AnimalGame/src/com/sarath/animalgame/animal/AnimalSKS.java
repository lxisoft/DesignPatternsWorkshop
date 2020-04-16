package com.sarath.animalgame.animal;

import com.sarath.animalgame.strategy.AnimalCategorySKS;

/**
 * @author SarathKumar S
 
 *
 */

public abstract class AnimalSKS {
	
//	public abstract String eatSKS();
	AnimalCategorySKS category;
	
	public String eatSKS() 
    {
		return category.eat();
    }

	
}
