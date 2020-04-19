package com.anjali.animalgame.factory;

import com.anjali.animalgame.animal.AfricanBearANJ;
import com.anjali.animalgame.animal.AfricanDeerANJ;
import com.anjali.animalgame.animal.AfricanLionANJ;
import com.anjali.animalgame.animal.AfricanRabbitANJ;
import com.anjali.animalgame.animal.AfricanTigerANJ;
import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.LionANJ;

public class AfricanAnimalFactory implements AnimalFactory {

	@Override
	public AnimalANJ createLion() {
		return new AfricanLionANJ();
	}

	@Override
	public AnimalANJ createTiger() {
		return new AfricanTigerANJ();
	}

	@Override
	public AnimalANJ createDeer() {
		return new AfricanDeerANJ();
	}

	@Override
	public AnimalANJ createRabbit() {
		return new AfricanRabbitANJ();
	}

	@Override
	public AnimalANJ createBear() {
		return new AfricanBearANJ();
	}

	
	

}
