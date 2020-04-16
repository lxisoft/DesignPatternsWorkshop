package com.sarath.animalgame.animal;

import com.sarath.animalgame.strategy.CarnivorSKS;

/**
 * @author SarathKumar S
 
 *
 */
public class LionSKS extends AnimalSKS {
	
	private String name;

	
	public LionSKS() {

		
		category = new CarnivorSKS();

	}
	
}
