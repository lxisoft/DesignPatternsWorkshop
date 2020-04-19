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
		AnimalFactory africanFactory=new AfricanAnimalFactory();

	      if(animalType.equalsIgnoreCase("RabbitANJ")){
	    	  return africanFactory.createRabbit();
	    	  // return new RabbitANJ(africanFactory);
	      } 
	      else if(animalType.equalsIgnoreCase("DeerANJ")){
	    	  return africanFactory.createDeer();
	        // return new DeerANJ(africanFactory);       
	      } 
	      else if(animalType.equalsIgnoreCase("TigerANJ")){
	    	  return africanFactory.createTiger();
	    	  //return new TigerANJ(africanFactory);       
	      }
	      else if(animalType.equalsIgnoreCase("LionANJ")){
	    	  return africanFactory.createLion();
	    	  // return new LionANJ(africanFactory);       
		  }
	      else if(animalType.equalsIgnoreCase("BearANJ")){
	    	  return africanFactory.createBear();
	    	  //return new BearANJ(africanFactory);       
		  }
	      else {
		return null;
	}
	}

}
