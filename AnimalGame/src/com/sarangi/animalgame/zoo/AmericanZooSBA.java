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

import com.sarangi.animalgame.animal.AnimalSBA;
import com.sarangi.animalgame.animalFactory.AmericanFatorySBA;
import com.sarangi.animalgame.animalFactory.AnimalFactorySBA;


/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class AmericanZooSBA extends ZooSBA{

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.zoo.ZooSBA#createAnimalSBA(java.lang.String)
	 */
	@Override
	public AnimalSBA createAnimalSBA(String animalName) {
		
		AnimalSBA animal = null;
		AnimalFactorySBA animalFactorySBA =new AmericanFatorySBA();;
		
		     if(animalName.equals("Bruce"))
		     {
		    	 animal = animalFactorySBA.createTigerSBA();
		    	 animal.setName(animalName);
		    	 
		     }
		
		return animal;
	}

	

}
