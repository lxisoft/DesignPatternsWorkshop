package com.akhil.animalgame.animal;

public class IotBasedAnimalsAKJ extends AnimalFactoryAKJ {

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
		}
		return null;
	}

}
