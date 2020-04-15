package com.sarath.animalgame.forest;

import com.sarath.animalgame.animal.*;
import com.sarath.animalgame.config.AnimalConfigSKS;
/**
 * @author SarathKumar S
 
 *
 */
public class ForestSKS {

	AnimalSKS tiger;
	AnimalSKS lion;
	AnimalSKS rabbit;
	

	String name;
	AnimalSKS[] animals;

	@Override
	public String toString() {
		return name;
	}

	private static ForestSKS forest = new ForestSKS();

	private ForestSKS() {

		name = "Periyar";

	}
	
	// singleton pattern
	public static ForestSKS getInstance() {
		return forest;
	}

	public void createAnimal() {
		AnimalConfigSKS instance = AnimalConfigSKS.getInstance();

		String type = instance.getType();
		AnimalFactorySKS animal = null;
		switch (type) {
		case "iot":
			animal = new IotBasedAnimalsSKS();
			break;
		case "mobile":
			animal = new MobileBasedAnimalsSKS();
			break;
		case "web":
			animal = new WebBasedAnimalsSKS();
			break;
		}
		
		System.out.print (animal.getAnimal("tiger").eatSKS());

	}
	
	public void eatSKS() {
		AnimalIteratorSKS iterator = new AnimalIteratorSKS(animals);
		
		while(iterator.hasNext()) {
			eatSKS();
		}
	}

}