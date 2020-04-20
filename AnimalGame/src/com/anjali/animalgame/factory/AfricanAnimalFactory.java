package com.anjali.animalgame.factory;

import com.anjali.animalgame.animal.AfricanBearANJ;
import com.anjali.animalgame.animal.AfricanDeerANJ;
import com.anjali.animalgame.animal.AfricanLionANJ;
import com.anjali.animalgame.animal.AfricanRabbitANJ;
import com.anjali.animalgame.animal.AfricanTigerANJ;
import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;
import com.anjali.animalgame.strategy.impl.Carnivore;
import com.anjali.animalgame.strategy.impl.Herbivore;
import com.anjali.animalgame.strategy.impl.Omnivore;

public class AfricanAnimalFactory implements AnimalFactory {


	/*
	 * Strategy Behaviour Composition
	 */
	protected FoodEatBehaviourANJ foodEatBehaviour; 

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
