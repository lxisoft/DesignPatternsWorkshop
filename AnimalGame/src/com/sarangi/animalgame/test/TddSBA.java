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
package com.sarangi.animalgame.test;

import java.util.ArrayList;
import java.util.List;

import com.sarangi.animalgame.animal.AnimalSBA;
import com.sarangi.animalgame.forest.AmericanForestSBA;
import com.sarangi.animalgame.forest.ForestSBA;
import com.sarangi.animalgame.forest.IndianForestSBA;
import com.sarangi.animalgame.zoo.AmericanZooSBA;
import com.sarangi.animalgame.zoo.IndianZooSBA;
import com.sarangi.animalgame.zoo.ZooAdapterSBA;
import com.sarangi.animalgame.zoo.ZooSBA;

/**
 * The TddSBA class implements an animal game
 * displays Zoo animals using AbstractFactory and Factory method design patterns.
 * displays Forest animals using Adapter design petterns.
 * 
 * @author SarangiBalu A
 * ,
 */
public class TddSBA {
	
	public static void main(String[] args) {
		
		ZooSBA indianZoo = new IndianZooSBA();
		ZooSBA americanZoo = new AmericanZooSBA();
		
		List<AnimalSBA> animals = new ArrayList<AnimalSBA>();
		
		animals = indianZoo.bringAnimalSBA("Machali","Asiatic");
		System.out.println("\n\t************************** INDIAN ZOO ANIMAL ************************************");
		     indianZoo.displayAnimalsSBA(animals);
		
		animals = americanZoo.bringAnimalSBA("Bruce","PantheraAtrox");
		System.out.println("\n\t************************* AMERICAN ZOO ANIMAL ***********************************");
		     americanZoo.displayAnimalsSBA(animals);
		     
		 ForestSBA americanForest = new AmericanForestSBA();  
		 ForestSBA indianForest = new IndianForestSBA();
		 
		 ZooSBA zooAdapter1 = new ZooAdapterSBA(indianForest);
		 ZooSBA zooAdapter2 = new ZooAdapterSBA(americanForest);
	     
		 animals = zooAdapter1.bringAnimalSBA("Machali","Asiatic");
		     System.out.println("\n\t************************** INDIAN FOREST ANIMAL ************************************");
		     zooAdapter1.displayAnimalsSBA(animals);
	         
		 animals = zooAdapter2.bringAnimalSBA("Bruce","PantheraAtrox");
		     System.out.println("\n\t************************* AMERICAN FOREST ANIMAL ***********************************");
		     zooAdapter1.displayAnimalsSBA(animals);
		
	
	}

}
