package com.akhil.animalgame.animal;

import com.akhil.animalgame.behavior.HerbivorousAKJ;

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
	
	@Override
	public String toString() {

		return   name;
	}
	
	public DeerAKJ() {
		eatBehaviourAKJ =new HerbivorousAKJ();
	}

}
