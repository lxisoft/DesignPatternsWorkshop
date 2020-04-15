package com.anjali.animalgame.factory.creator;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.DeerANJ;
import com.anjali.animalgame.animal.RabbitANJ;

/*
 * Concrete class for factory pattern
 */
public class HerbivoreAnimalCreatorANJ extends AnimalCreatorANJ{

	
	@Override
	public AnimalANJ createAnimal(String animalType) {
			
	      if(animalType.equalsIgnoreCase("RabbitANJ")){
	    	  System.out.println("created rabbit");
	         return new RabbitANJ();
	         
	      } else if(animalType.equalsIgnoreCase("DeerANJ")){
	         return new DeerANJ();       
	      } else {
		return null;
	}
	}

}
