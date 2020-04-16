package com.sarath.animalgame.factory;

import com.sarath.animalgame.animal.AnimalSKS;
import com.sarath.animalgame.animal.LionSKS;
import com.sarath.animalgame.animal.RabbitSKS;
import com.sarath.animalgame.animal.TigerSKS;
import com.sarath.animalgame.decorator.IotBasedAnimalsDecoratorSKS;

/**
 * @author SarathKumar S
 
 *
 */
public class IotBasedAnimalsSKS extends AnimalFactorySKS {

	public AnimalSKS getAnimal(String type) {
		
		System.out.print(type);
		AnimalSKS animal = null;
		switch (type) {

		case "lion":
			animal = new IotBasedAnimalsDecoratorSKS(new LionSKS());
			break;
		case "tiger":
			animal = new IotBasedAnimalsDecoratorSKS(new TigerSKS());
			break;
		case "rabbit":
			animal = new IotBasedAnimalsDecoratorSKS(new RabbitSKS());
			break;
		}
		;
		return animal;

	}

	

}