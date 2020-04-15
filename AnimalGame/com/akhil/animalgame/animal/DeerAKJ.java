package com.akhil.animalgame.animal;
/**
 * @author Akhil
 * 
 * Implemented Singleton Pattern
 *
 */

public class DeerAKJ extends AnimalAKJ{

	private String name;



	@Override
	public String eatAKJ() {
		
		
		return "Deer eating plants...";
	}

	public DeerAKJ(String name) {
		this.name = name;
	}
}
