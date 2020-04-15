/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sarangi.animalgame.zoo;

import java.util.ArrayList;
import java.util.List;

import com.sarangi.animalgame.animal.AnimalSBA;
import com.sarangi.animalgame.animalBehaviour.AggressiveBehaviourSBA;
import com.sarangi.animalgame.animalBehaviour.AgonisticBehaviourSBA;
import com.sarangi.animalgame.animalBehaviour.AnimalBehaviourSBA;
import com.sarangi.animalgame.animalFactory.AnimalFactorySBA;
import com.sarangi.animalgame.animalFactory.IndianFactorySBA;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class IndianZooSBA extends ZooSBA{

	
	@Override
	public List<AnimalSBA> createAnimalsSBA(List<String> animalNames) {
		
		AnimalSBA animal = null;
		AnimalBehaviourSBA animalBehaviour;
		
		List<AnimalSBA> indianAnimals = new ArrayList<AnimalSBA>();
		
		AnimalFactorySBA animalFactorySBA =new IndianFactorySBA();;
		
		  for(String animalName : animalNames)
		  {	  
		     if(animalName.equals("Machali"))
		     {
		    	 animal = animalFactorySBA.createTigerSBA();
		    	 animal.setName(animalName);
		    	 animalBehaviour = new AggressiveBehaviourSBA();
		    	 animal.setAnimalBehaviourSBA(animalBehaviour);		 
		    	 
		    	 indianAnimals.add(animal);
		    	 
		     }
		     else if(animalName.equals("Asiatic"))
		     {
		    	 animal = animalFactorySBA.createLionSBA();
		    	 animal.setName(animalName);
		    	 animalBehaviour = new AgonisticBehaviourSBA();
		    	 animal.setAnimalBehaviourSBA(animalBehaviour);	
		    	 
		    	 indianAnimals.add(animal); 
		     }
		  }   
		
		return indianAnimals;
	}

}
