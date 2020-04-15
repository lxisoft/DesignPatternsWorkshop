package com.anjali.animalgame.factory.creator;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.BearANJ;
import com.anjali.animalgame.animal.DeerANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.animal.RabbitANJ;
import com.anjali.animalgame.animal.TigerANJ;

/*
 * Concrete class for factory pattern
 */
public class CarnivoreAnimalCreatorANJ extends AnimalCreatorANJ{

	AnimalANJ createdAnimal;
	
	@Override
	public AnimalANJ createAnimal(String animalType) {
		
	      if(animalType.equalsIgnoreCase("LionANJ")){
	         return new LionANJ();
	         
	      }
	      else if(animalType.equalsIgnoreCase("TigerANJ")){
		         return new TigerANJ();       
		  } else {
		return null;
	}
	}
}
