package com.sarath.animalgame.animal;

import com.sarath.animalgame.strategy.CarnivorSKS;

/**
 * @author SarathKumar S
 
 *
 */
public class TigerSKS extends AnimalSKS {
	
	private String name;


	public TigerSKS() {

		category = new CarnivorSKS();
	}

}
