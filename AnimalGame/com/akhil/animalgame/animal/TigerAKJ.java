package com.akhil.animalgame.animal;

import com.akhil.animalgame.behavior.CarnivorousAKJ;

/**
 * @author Akhil
 * 
 *         
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
	
	@Override
	public String toString() {

		return   name;
	}

	public TigerAKJ() {
		eatBehaviourAKJ =new CarnivorousAKJ();
	}


}
