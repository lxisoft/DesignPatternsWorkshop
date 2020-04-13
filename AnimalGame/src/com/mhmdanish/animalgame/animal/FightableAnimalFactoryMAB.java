package com.mhmdanish.animalgame.animal;

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
