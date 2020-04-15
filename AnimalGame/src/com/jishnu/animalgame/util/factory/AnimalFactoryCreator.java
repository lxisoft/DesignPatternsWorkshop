package com.jishnu.animalgame.util.factory;

public class AnimalFactoryCreator {

	public static AnimalFactory getFactory(AnimalFactoryType type) {

		AnimalFactory factory = null;

		switch(type) {

		case IOT: 
			factory = new IotAnimalFactory();
			break;
		case WEB:
			factory = new WebAnimalFactory();
			break;
		case MOBILE:
			factory = new MobileAnimalFactory();
		}
		return factory;
	}
}
