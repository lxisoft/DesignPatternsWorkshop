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
import java.util.Arrays;
import java.util.List;

import com.sarangi.animalgame.animal.AnimalSBA;


/**
 * TODO Provide a detailed description here
 * @author Owner
 * 
 */
public abstract class ZooSBA {

	/**
	 * @return
	 */
	public List<AnimalSBA> bringAnimalSBA(String... animalNames) {
		
		List<String> animalNamelist = new ArrayList<String>(Arrays.asList(animalNames));
		
		List<AnimalSBA> animals = createAnimalsSBA(animalNamelist);
		
		return animals;
	}
	
	public abstract List<AnimalSBA> createAnimalsSBA(List<String> animalNamelist);
	
	public void displayAnimalsSBA(List<AnimalSBA> animals) 
	{
		for(AnimalSBA animal : animals)
		{
			System.out.println("\n\t Animal -> "+animal+"\n\t Name   -> "+animal.getName()+"\n\t Fight Behaviour   -> "+animal.getAnimalBehaviourSBA());
		    animal.getAnimalBehaviourSBA().FightBehaviourSBA();
		    
		    
		}
	         
	}

}
