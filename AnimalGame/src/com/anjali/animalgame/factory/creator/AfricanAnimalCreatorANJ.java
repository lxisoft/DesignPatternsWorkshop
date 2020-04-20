package com.anjali.animalgame.factory.creator;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.BearANJ;
import com.anjali.animalgame.animal.DeerANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.animal.RabbitANJ;
import com.anjali.animalgame.animal.TigerANJ;
import com.anjali.animalgame.factory.AfricanAnimalFactory;
import com.anjali.animalgame.factory.AnimalFactory;

/*
 * Concrete class for factory pattern implementing template method
 */
public class AfricanAnimalCreatorANJ extends AnimalCreatorANJ{

	@Override
	public AnimalANJ createAnimal(String animalType) {
		
		AnimalFactory factory=new AfricanAnimalFactory();
		
	      if(animalType.equalsIgnoreCase("BearANJ")){
	    	  return factory.createBear();
			}
	      else if(animalType.equalsIgnoreCase("DeerANJ")){
	    	  return factory.createDeer();      
	      } 
	      else if(animalType.equalsIgnoreCase("TigerANJ")){
	    	  return factory.createTiger();
	      }
	      else if(animalType.equalsIgnoreCase("LionANJ")){
	    	  return factory.createLion();     
		  }
	      else if(animalType.equalsIgnoreCase("RabbitANJ")){
	    	  return factory.createRabbit();
	     }
	      else {
		return null;
	}
	}

}
