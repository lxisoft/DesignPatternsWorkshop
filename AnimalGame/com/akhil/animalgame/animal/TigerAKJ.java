package com.akhil.animalgame.animal;

/**
 * @author Akhil
 * 
 *         Implemented Singleton Pattern
 *
 */

public class TigerAKJ extends AnimalAKJ {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String eatAKJ() {

		return name + " ate Meat";
	}

	public TigerAKJ(String name) {

		this.name = name;
	}

}
