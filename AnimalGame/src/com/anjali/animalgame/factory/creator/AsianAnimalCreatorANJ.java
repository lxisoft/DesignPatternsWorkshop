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
public class AsianAnimalCreatorANJ extends AnimalCreatorANJ{

	@Override
	public AnimalANJ createAnimal(String animalType) {
		AnimalFactory asianFactory=new AfricanAnimalFactory();

	      if(animalType.equalsIgnoreCase("RabbitANJ")){
	    	  return asianFactory.createRabbit();
	    	 //return new RabbitANJ(asianFactory);
	      } 
	      else if(animalType.equalsIgnoreCase("DeerANJ")){
	    	  return asianFactory.createDeer();
	    	  // return new DeerANJ(asianFactory);       
	      } 
	      else if(animalType.equalsIgnoreCase("TigerANJ")){
		     return asianFactory.createTiger();
	    	 // return new TigerANJ(asianFactory);       
	      }
	      else if(animalType.equalsIgnoreCase("LionANJ")){
	    	  return asianFactory.createLion();
	    	  //return new LionANJ(asianFactory);       
		  }
	      else if(animalType.equalsIgnoreCase("BearANJ")){
			  return asianFactory.createBear();
	    	  // return new BearANJ(asianFactory);       
		  }
	      else {
		return null;
	}
	}

	
}
