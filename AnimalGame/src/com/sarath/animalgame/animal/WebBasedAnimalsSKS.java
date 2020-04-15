package com.sarath.animalgame.animal;

/**
 * @author SarathKumar S
 
 *
 */
public class WebBasedAnimalsSKS extends AnimalFactorySKS {

	@Override
	public AnimalSKS getAnimal(String type) {
		
		if (type.equals("tiger")) {
			return new TigerSKS("Web based Tiger");
		} else if (type.equals("lion")) {
			return new LionSKS("Web based Lion");
//		} else if (type.equals("deer")) {
//			return new DeerAKJ("Web based Deer");
		} else if (type.equals("rabbit")) {
			return new RabbitSKS("Web based Rabbit");
		}
		return null;
	}
}