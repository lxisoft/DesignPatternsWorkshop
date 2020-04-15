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

import java.util.List;

import com.sarangi.animalgame.animal.AnimalSBA;
import com.sarangi.animalgame.forest.ForestSBA;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class ZooAdapterSBA extends ZooSBA{
	
	ForestSBA forest;
	
	public ZooAdapterSBA(ForestSBA forest)
	{
		this.forest = forest;
	}

	public List<AnimalSBA> bringAnimalSBA(String... animalNames) {
		
		return forest.bringAnimalSBA(animalNames);
	}
	
	

	@Override
	public List<AnimalSBA> createAnimalsSBA(List<String> animalNamelist) {
		
		return null;
	}

	
}
