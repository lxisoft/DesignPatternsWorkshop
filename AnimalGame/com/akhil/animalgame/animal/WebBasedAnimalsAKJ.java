package com.akhil.animalgame.animal;

public class WebBasedAnimalsAKJ extends AnimalFactoryAKJ {

	@Override
	public AnimalAKJ getAnimal(String type) {
		if (type.equals("tiger")) {
			return new TigerAKJ("Web based Tiger");
		} else if (type.equals("lion")) {
			return new LionAKJ("Web based Lion");
		} else if (type.equals("deer")) {
			return new DeerAKJ("Web based Deer");
		} else if (type.equals("rabbit")) {
			return new RabbitAKJ("Web based Rabbit");
		}
		return null;
	}
}
