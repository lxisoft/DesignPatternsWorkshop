package com.sarath.animalgame.animal;

/**
 * @author SarathKumar S
 
 *
 */
public class TigerSKS extends AnimalSKS {
	
	private String name;

	
//	public String eatSKS() {
//
//		return name + " ate Meat";
//	}

	public TigerSKS(String name) {

		this.name = name;
		System.out.print(name);
		category = new CarnivorSKS();
	}

}
