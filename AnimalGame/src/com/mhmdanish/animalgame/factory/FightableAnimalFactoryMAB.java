package com.mhmdanish.animalgame.factory;

import com.mhmdanish.animalgame.adapter.DuckAdapterMAB;
import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.DuckMAB;
import com.mhmdanish.animalgame.animal.LionMAB;
import com.mhmdanish.animalgame.animal.TigerMAB;
import com.mhmdanish.animalgame.decorator.FightableMAB;

public class FightableAnimalFactoryMAB extends AbstractAnimalFactoryMAB {

	@Override
	public AnimalMAB createAnimal(String type) {
		if(type.equals("tiger")) {
			return new FightableMAB(new TigerMAB());
		} else if(type.equals("lion")) {
			return new FightableMAB(new LionMAB());
		} else if(type.equals("duck")) {
			return new FightableMAB(new DuckAdapterMAB(new DuckMAB()));
		}
		return null;
	}

}
