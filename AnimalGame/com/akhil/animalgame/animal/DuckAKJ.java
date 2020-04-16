package com.akhil.animalgame.animal;

import com.akhil.animalgame.behavior.HerbivorousAKJ;

/**
 * @author Akhil
 * 
 * Implemented Singleton Pattern
 *
 */

public class DuckAKJ extends AnimalAKJ{

	private String name;



	@Override
	public String eatAKJ() {
		
		
		return "Duck eating plants...";
	}

	public DuckAKJ(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {

		return   name;
	}
	
	public DuckAKJ() {
		eatBehaviourAKJ =new HerbivorousAKJ();
	}

}
