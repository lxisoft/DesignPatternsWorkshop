package com.sarath.animalgame.animal;

import com.sarath.animalgame.strategy.HerbivorSKS;

/**
 * @author SarathKumar S
 
 *
 */
public class RabbitSKS extends AnimalSKS {
	
	private String name;

	
	public RabbitSKS() {

		category = new HerbivorSKS();

	}

}
