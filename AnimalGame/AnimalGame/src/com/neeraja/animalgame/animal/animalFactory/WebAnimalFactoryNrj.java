package com.neeraja.animalgame.animal.animalFactory;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.EagleNrj;
import com.neeraja.animalgame.animal.LionNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.animal.adapter.EagleAdapterNrj;
import com.neeraja.animalgame.animal.animaltype.MobileAnimalNrj;
import com.neeraja.animalgame.animal.animaltype.WebAnimalNrj;

public class WebAnimalFactoryNrj extends AbstractAnimalFactoryNrj {

	@Override
	public AnimalNrj createAnimal(String animalType) {
		if(animalType.equals("tiger")) {
			return new WebAnimalNrj(new TigerNrj());
		} else if(animalType.equals("lion")) {
			return new WebAnimalNrj(new LionNrj());
		} else if(animalType.equals("eagle")) {
			return new WebAnimalNrj(new EagleAdapterNrj(new EagleNrj()));
		}
		return null;
	}

}
