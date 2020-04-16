package com.sarath.animalgame.forest;

import com.sarath.animalgame.animal.*;
import com.sarath.animalgame.config.AnimalConfigSKS;
import com.sarath.animalgame.factory.AnimalFactorySKS;
import com.sarath.animalgame.factory.IotBasedAnimalsSKS;
import com.sarath.animalgame.factory.MobileBasedAnimalsSKS;
import com.sarath.animalgame.factory.WebBasedAnimalsSKS;
/**
 * @author SarathKumar S
 
 *
 */
public class ForestSKS {

//	AnimalSKS tiger;
//	AnimalSKS lion;
//	AnimalSKS rabbit;
	

	String name;
	AnimalSKS animals;

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
		//System.out.println ("Type ="+type);
		AnimalFactorySKS animal = null;
		IotBasedAnimalsSKS an=null;
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
//		System.out.print (an.getAnimal("lion").eatSKS());
		System.out.print (animal.getAnimal("lion").eatSKS());

	}
}