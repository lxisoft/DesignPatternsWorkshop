package com.greeshma.animalgame.factory;

import com.greeshma.animalgame.animal.AnimalGCG;
import com.greeshma.animalgame.animal.LionGCG;
import com.greeshma.animalgame.animal.TigerGCG;
import com.greeshma.animalgame.decorator.IotGCG;

public class IotFactory implements AbstractAnimalFactoryGCG {

	@Override
	public AnimalGCG createAnimalGCG(String animalType) {
		if(animalType.equals("lion")) {
			return new IotGCG(new LionGCG());
		} else if(animalType.equals("tiger")) {
			return new IotGCG(new TigerGCG());
		}
		return null;

	}
}
