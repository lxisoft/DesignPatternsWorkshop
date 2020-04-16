package com.sarath.animalgame.factory;

public class AnimalFactoryCreatorSKS {

	public static AnimalFactorySKS getFactory(String type) {

		AnimalFactorySKS factory = null;

		switch(type) {

		case "Iot": 
			factory = new IotBasedAnimalsSKS();
			break;
		case "Web":
			factory = new WebBasedAnimalsSKS();
			break;
		case "MOBILE":
			factory = new MobileBasedAnimalsSKS();
		}
		return factory;
	}
}
