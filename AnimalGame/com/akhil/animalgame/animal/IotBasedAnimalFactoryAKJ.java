package com.akhil.animalgame.animal;


/**
 * @author Akhil
 * 
 *
 */

public class IotBasedAnimalFactoryAKJ extends AnimalFactoryAKJ {

	@Override
	public AnimalAKJ getAnimal(String type) {
		if (type.equals("tiger")) {
			return new TigerAKJ("Iot based Tiger");
		} else if (type.equals("lion")) {
			return new LionAKJ("Iot based Lion");
		} else if (type.equals("deer")) {
			return new DeerAKJ("Iot based Deer");
		} else if (type.equals("rabbit")) {
			return new RabbitAKJ("Iot based Rabbit");
		} else if (type.equals("duck")) {
			return new DuckAKJ("Iot based Duck");
		}
		return null;
	}

}
