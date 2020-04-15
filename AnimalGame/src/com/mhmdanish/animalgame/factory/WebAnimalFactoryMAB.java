package com.mhmdanish.animalgame.factory;

import com.mhmdanish.animalgame.adapter.DuckAdapterMAB;
import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.DuckMAB;
import com.mhmdanish.animalgame.animal.LionMAB;
import com.mhmdanish.animalgame.animal.TigerMAB;
import com.mhmdanish.animalgame.decorator.WebAnimalMAB;

public class WebAnimalFactoryMAB extends AbstractAnimalFactoryMAB {

	@Override
	public AnimalMAB createAnimal(String type) {
		if(type.equals("tiger")) {
			return new WebAnimalMAB(new TigerMAB());
		} else if(type.equals("lion")) {
			return new WebAnimalMAB(new LionMAB());
		} else if(type.equals("duck")) {
			return new WebAnimalMAB(new DuckAdapterMAB(new DuckMAB()));
		}
		return null;
	}

}
