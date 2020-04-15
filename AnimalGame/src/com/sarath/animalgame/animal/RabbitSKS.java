package com.sarath.animalgame.animal;

/**
 * @author SarathKumar S
 
 *
 */
public class RabbitSKS extends AnimalSKS {
	
	private String name;

	
//	public String eatSKS() {
//
//		return name + " ate Meat";
//	}

	public RabbitSKS(String name) {

		this.name = name;
		System.out.print(name);
		category = new HerbivorSKS();

	}

}
