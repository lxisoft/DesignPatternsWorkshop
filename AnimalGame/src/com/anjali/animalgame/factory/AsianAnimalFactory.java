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
		return new AsianLionANJ();
	}

	@Override
	public AnimalANJ createTiger() {
		return new AsianTigerANJ();
	}

	@Override
	public AnimalANJ createDeer() {
		return new AsianDeerANJ();
	}

	@Override
	public AnimalANJ createRabbit() {
		return new AsianRabbitANJ();
	}

	@Override
	public AnimalANJ createBear() {
		return new AsianBearANJ();
	}

}
