package com.sarath.animalgame.animal;

/**
 * @author SarathKumar S
 
 *
 */
public class LionSKS extends AnimalSKS {
	
	private String name;

	
	public LionSKS(String name) {

		this.name = name;
		System.out.print(name);
		category = new CarnivorSKS();

	}
	
}
