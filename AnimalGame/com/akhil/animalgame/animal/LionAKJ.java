package com.akhil.animalgame.animal;

import com.akhil.animalgame.behavior.CarnivorousAKJ;

/**
 * @author Akhil
 * 
 *         Implemented Singleton Pattern
 *
 */

public class LionAKJ extends AnimalAKJ {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String eatAKJ() {

		return "Lion ate Meat";
	}

	public LionAKJ(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return  name;
	}
	public LionAKJ() {
		eatBehaviourAKJ =new CarnivorousAKJ();
	}

}
