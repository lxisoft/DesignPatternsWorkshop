package com.neeraja.animalgame.animal.animalFactory;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.EagleNrj;
import com.neeraja.animalgame.animal.LionNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.animal.adapter.EagleAdapterNrj;
import com.neeraja.animalgame.animal.animaltype.IotAnimalNrj;
import com.neeraja.animalgame.animal.animaltype.MobileAnimalNrj;

public class MobileAnimalFactoryNrj extends AbstractAnimalFactoryNrj {

	@Override
	public AnimalNrj createAnimal(String animalType) {
		AnimalNrj a=null;
		if(animalType.equals("tiger")) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>inside tiger");
			a= new MobileAnimalNrj(new TigerNrj());
		} else if(animalType.equals("lion")) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>inside lion");
			a= new MobileAnimalNrj(new LionNrj());
		} else if(animalType.equals("eagle")) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>inside eagle");
			a= new MobileAnimalNrj(new EagleAdapterNrj(new EagleNrj()));
		}
		System.out.println("******************"+a);
		return a;
	}
}
