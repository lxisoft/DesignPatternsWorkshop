package com.akhil.animalgame.animal;

public class AnimalFactoryAKJ {

	private AnimalFactoryAKJ() {

	}

	public static AnimalFactoryAKJ getInstance() {
		return AnimalFactoryInstance.INSTANCE;
	}

	public AnimalAKJ getAnimal(String type) {

		if (type.equals("tiger")) {
			return new TigerAKJ();
		} else if (type.equals("lion")) {
			return new LionAKJ();
		} else if (type.equals("deer")) {
			return new DeerAKJ();
		} else if (type.equals("rabbit")) {
			return new RabbitAKJ();
		}

		return null;
	}

	private static class AnimalFactoryInstance {
		public static final AnimalFactoryAKJ INSTANCE = new AnimalFactoryAKJ();
	}

}
