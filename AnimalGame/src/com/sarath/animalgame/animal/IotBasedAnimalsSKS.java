package com.sarath.animalgame.animal;

/**
 * @author SarathKumar S
 
 *
 */
public class IotBasedAnimalsSKS extends AnimalFactorySKS {

	@Override
	public AnimalSKS getAnimal(String type) {
		
		if (type.equals("tiger")) {
			return new TigerSKS("Iot based Tiger");
		} else if (type.equals("lion")) {
			return new LionSKS("Iot based Lion");
		} else if (type.equals("rabbit")) {
			return new RabbitSKS("Iot based Rabbit");
		}
		return null;
	}
}