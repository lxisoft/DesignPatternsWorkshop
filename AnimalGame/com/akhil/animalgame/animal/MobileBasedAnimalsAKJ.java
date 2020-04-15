package com.akhil.animalgame.animal;

public class MobileBasedAnimalsAKJ extends AnimalFactoryAKJ {
	@Override
	public AnimalAKJ getAnimal(String type) {
		if (type.equals("tiger")) {
			return new TigerAKJ("Mobile based Tiger");
		} else if (type.equals("lion")) {
			return new LionAKJ("Mobile based Lion");
		} else if (type.equals("deer")) {
			return new DeerAKJ("Moile based Deer");
		} else if (type.equals("rabbit")) {
			return new RabbitAKJ("Mobile based Rabbit");
		}
		return null;
	}

}
