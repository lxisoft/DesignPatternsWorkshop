package com.abdul.rafeek.animalgame.factory;
import com.abdul.rafeek.animalgame.animal.*;

import java.util.ArrayList;
import java.util.List;

import com.abdul.rafeek.animalgame.alien.*;
public class Level1 extends AnimalGame {

	@Override
	protected List<AnimalARK> createAnimal(String type,int count) {
		List<AnimalARK> animalList = new ArrayList<>();
		WeaponFactory animalFamilyFactory =
				new Level1WeaponFactory();
		if (type.equals("Lion")) {
			for (int i = 0; i < count; i++) {

				animalList.add(new LionARK(animalFamilyFactory));

			}
		} else if (type.equals("Tiger")) {
			for (int i = 0; i < count; i++) {

				animalList.add(new TigerARK(animalFamilyFactory));

			}
			
			
		} else if (type.equals("Fox")) {
			
			for (int i = 0; i < count; i++) {

				animalList.add(new FoxARK(animalFamilyFactory));

			}
			
		}
		return animalList;
	}
	
	
	
 
}
