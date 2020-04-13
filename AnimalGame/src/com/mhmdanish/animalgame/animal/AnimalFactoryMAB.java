package com.mhmdanish.animalgame.animal;

public class AnimalFactoryMAB extends AbstractAnimalFactoryMAB {

	@Override
	public AnimalMAB createAnimal(String type) {
		if(type.equals("tiger")) {
			return new TigerMAB();
		} else if(type.equals("lion")) {
			return new LionMAB();
		} else if(type.equals("duck")) {
			return new DuckAdapterMAB(new DuckMAB());
		}
		return null;
	}

}
