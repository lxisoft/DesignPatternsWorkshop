package com.anjali.animalgame.factory;

import com.anjali.animalgame.animal.AfricanLionANJ;
import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.AsianBearANJ;
import com.anjali.animalgame.animal.AsianDeerANJ;
import com.anjali.animalgame.animal.AsianLionANJ;
import com.anjali.animalgame.animal.AsianRabbitANJ;
import com.anjali.animalgame.animal.AsianTigerANJ;
import com.anjali.animalgame.strategy.impl.Carnivore;
import com.anjali.animalgame.strategy.impl.Herbivore;
import com.anjali.animalgame.strategy.impl.Omnivore;

public class AsianAnimalFactory implements AnimalFactory{

	@Override
	public AnimalANJ createLion() {
		return new AsianLionANJ.Builder().animalName("Lion").isAlive(true).foodEatBehaviour(new Carnivore()).build();
	}

	@Override
	public AnimalANJ createTiger() {
		return new AsianTigerANJ.Builder().animalName("Tiger").isAlive(true).foodEatBehaviour(new Carnivore()).build();
	}

	@Override
	public AnimalANJ createDeer() {
		return new AsianDeerANJ.Builder().animalName("Deer").isAlive(true).foodEatBehaviour(new Herbivore()).build();
	}

	@Override
	public AnimalANJ createRabbit() {
		return new AsianRabbitANJ.Builder().animalName("Rabbit").isAlive(true).foodEatBehaviour(new Herbivore()).build();
	}

	@Override
	public AnimalANJ createBear() {
		return new AsianBearANJ.Builder().animalName("Bear").isAlive(true).foodEatBehaviour(new Omnivore()).build();
	}

}
