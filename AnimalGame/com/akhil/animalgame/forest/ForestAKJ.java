package com.akhil.animalgame.forest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.akhil.animalgame.animal.AnimalAKJ;
import com.akhil.animalgame.animal.AnimalFactoryAKJ;
import com.akhil.animalgame.animal.AnimalIteratorAKJ;
import com.akhil.animalgame.animal.IotBasedAnimalFactoryAKJ;
import com.akhil.animalgame.animal.MobileBasedAnimalFactoryAKJ;
import com.akhil.animalgame.animal.WebBasedAnimalFactoryAKJ;
import com.akhil.animalgame.command.CommandAKJ;
import com.akhil.animalgame.command.EatCommandAKJ;
import com.akhil.animalgame.command.InvokerAKJ;
import com.akhil.animalgame.config.AnimalConfig;

/**
 * @author Akhil
 * 
 *         Singleton Pattern 
 *         abstract factory pattern 
 *         factory pattern
 *        
 *
 */

public class ForestAKJ {

	List<AnimalAKJ> animals = new ArrayList<>();
	AnimalFactoryAKJ animalFactory = null;
	String name;

	@Override
	public String toString() {
		return name;
	}

	private static ForestAKJ forest = new ForestAKJ();

	private ForestAKJ() {

		name = "Muthanga";

	}

	public static ForestAKJ getInstance() {
		return forest;
	}

	public void createAnimal() {
		AnimalConfig instance = AnimalConfig.getInstance();

		String type = instance.getType();
		
		switch (type) {
		case "iot":
			animalFactory = new IotBasedAnimalFactoryAKJ();
			break;
		case "mobile":
			animalFactory = new MobileBasedAnimalFactoryAKJ();
			break;
		case "web":
			animalFactory = new WebBasedAnimalFactoryAKJ();
			break;
		}

		List<String> animalNames = Arrays.asList("duck","tiger", "lion", "rabbit", "deer");
		for (int i = 0; i < 5; i++) {
			AnimalAKJ animal = animalFactory.getAnimal(animalNames.get(new Random().nextInt(2+1)));
			animals.add(animal);
			System.out.println(animal.getClass().getName());
			System.out.println(animal+"roaming...");
		}

	}

	public void eatAkJ() {

		AnimalIteratorAKJ iterator = new AnimalIteratorAKJ(animals);
	
		while (iterator.hasNext()) {
			eatAKJ(iterator.next());
			System.out.println("mm");
		}
	}

	private void eatAKJ(AnimalAKJ animal) {

		CommandAKJ animalCommand = new EatCommandAKJ(animal);
		InvokerAKJ animalInvoker = new InvokerAKJ(animalCommand);
		animalInvoker.executeAKJ();

	}
}
