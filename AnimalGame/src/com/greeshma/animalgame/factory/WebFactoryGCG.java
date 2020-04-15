package com.greeshma.animalgame.factory;

import com.greeshma.animalgame.animal.AnimalGCG;
import com.greeshma.animalgame.animal.LionGCG;
import com.greeshma.animalgame.animal.TigerGCG;
import com.greeshma.animalgame.decorator.IotGCG;
import com.greeshma.animalgame.decorator.WebGCG;

public class WebFactoryGCG implements AbstractAnimalFactoryGCG {
	@Override
	public AnimalGCG createAnimalGCG(String animalType) {
		if(animalType.equals("lion")) {
			return new WebGCG(new LionGCG());
		} else if(animalType.equals("tiger")) {
			return new WebGCG(new TigerGCG());
		}
		return null;

	}
}
