package com.anjali.animalgame.factory.creator;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.BearANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.animal.TigerANJ;

public class OmnivoreAnimalCreatorANJ extends AnimalCreatorANJ{

AnimalANJ createdAnimal;
	
	@Override
	public AnimalANJ createAnimal(String animalType) {
		
	      if(animalType.equalsIgnoreCase("BearANJ")){
	         return new BearANJ();
	         
	      } else {
		return null;
	}
	}
}
