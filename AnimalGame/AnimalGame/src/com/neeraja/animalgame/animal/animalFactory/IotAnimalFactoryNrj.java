package com.neeraja.animalgame.animal.animalFactory;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.EagleNrj;
import com.neeraja.animalgame.animal.LionNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.animal.adapter.EagleAdapterNrj;
import com.neeraja.animalgame.animal.animaltype.IotAnimalNrj;

public class IotAnimalFactoryNrj extends AbstractAnimalFactoryNrj {

	@Override
	public AnimalNrj createAnimal(String animalType) {
		if(animalType.equals("tiger")) {
			return new IotAnimalNrj(new TigerNrj());
		} else if(animalType.equals("lion")) {
			return new IotAnimalNrj(new LionNrj());
		} else if(animalType.equals("eagle")) {
			return new IotAnimalNrj(new EagleAdapterNrj(new EagleNrj()));
		}
		return null;
	}
	}


