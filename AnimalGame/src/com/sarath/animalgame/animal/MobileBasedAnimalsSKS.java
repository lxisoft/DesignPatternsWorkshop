package com.sarath.animalgame.animal;

/**
 * @author SarathKumar S
 
 *
 */
public class MobileBasedAnimalsSKS extends AnimalFactorySKS {

	@Override
	public AnimalSKS getAnimal(String type) {
		
		if (type.equals("tiger")) {
			return new TigerSKS("Mobile based Tiger");
		} else if (type.equals("lion")) {
			return new LionSKS("Mobile based Lion");
//		} else if (type.equals("deer")) {
//			return new DeerAKJ("Web based Deer");
		} else if (type.equals("rabbit")) {
			return new RabbitSKS("Mobile based Rabbit");
		}
		return null;
	}
}