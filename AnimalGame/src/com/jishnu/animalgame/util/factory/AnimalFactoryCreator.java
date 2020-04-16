package com.jishnu.animalgame.util.factory;

import com.jishnu.animalgame.config.PlatformType;

public class AnimalFactoryCreator {

	public static AnimalFactory getFactory(PlatformType type) {

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
