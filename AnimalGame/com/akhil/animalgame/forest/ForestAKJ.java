package com.akhil.animalgame.forest;

import com.akhil.animalgame.animal.AnimalAKJ;
import com.akhil.animalgame.animal.AnimalFactoryAKJ;
import com.akhil.animalgame.animal.IotBasedAnimalsAKJ;
import com.akhil.animalgame.animal.MobileBasedAnimalsAKJ;
import com.akhil.animalgame.animal.WebBasedAnimalsAKJ;
import com.akhil.animalgame.config.AnimalConfig;

/**
 * @author Akhil
 * 
 *         Implemented Singleton Pattern
 *         abstract factory pattern
 *         factory pattern
 *
 */

public class ForestAKJ {

	AnimalAKJ tiger;
	AnimalAKJ lion;
	AnimalAKJ rabbit;
	AnimalAKJ deer;

	String name;

	@Override
	public String toString() {
		return name;
	}

	private static ForestAKJ forest = new ForestAKJ();

	private ForestAKJ() {

		name = "Muthanga";

	}

	public static ForestAKJ getInstance() {
		return forest;
	}

	public void createAnimal() {
		AnimalConfig instance = AnimalConfig.getInstance();

		String type = instance.getType();
		AnimalFactoryAKJ animal = null;
		switch (type) {
		case "iot":
			animal = new IotBasedAnimalsAKJ();
			break;
		case "mobile":
			animal = new MobileBasedAnimalsAKJ();
			break;
		case "web":
			animal = new WebBasedAnimalsAKJ();
			break;
		}

		System.out.print(animal.getAnimal("tiger").eatAKJ());

	}

}
