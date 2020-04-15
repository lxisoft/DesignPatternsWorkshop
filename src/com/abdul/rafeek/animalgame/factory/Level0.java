package com.abdul.rafeek.animalgame.factory;

import com.abdul.rafeek.animalgame.animal.*;
import com.abdul.rafeek.animalgame.alien.*;
import java.util.*;

public class Level0 extends AnimalGame {

	@Override
	public List<AnimalARK> createAnimal(String type, int count) {

		List<AnimalARK> animalList = new ArrayList<>();
		//AnimalARK a[] =new AnimalARK[count];
		WeaponFactory weaponFactory = new Level0WeaponFactory();
		if (type.equals("Lion")) {
			AnimalARK a[] =new AnimalARK[count];
			for (int i = 0; i < count; i++) {
				
				a[i]=new LionARK(weaponFactory);
				a[i].weaponsInHand();
				animalList=Arrays.asList(a);

			}
		} else if (type.equals("Tiger")) {
			AnimalARK a[] =new AnimalARK[count];
			for (int i = 0; i < count; i++) {
				a[i]=new TigerARK(weaponFactory);
				a[i].weaponsInHand();
				animalList=Arrays.asList(a);

			}

		} else if (type.equals("Fox")) {
			AnimalARK a[] =new AnimalARK[count];
			for (int i = 0; i < count; i++) {
				a[i]=new FoxARK(weaponFactory);
				a[i].weaponsInHand();
				animalList=Arrays.asList(a);

			}

		}
		return animalList;

	}

}
