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
package com.sarangi.animalgame.client;

import com.sarangi.animalgame.animal.AnimalSBA;
import com.sarangi.animalgame.zoo.AmericanZooSBA;
import com.sarangi.animalgame.zoo.IndianZooSBA;
import com.sarangi.animalgame.zoo.ZooSBA;

/**
 * The TddSBA class implements an animal game
 * displays animals using AbstractFactory and Factory design patterns.
 *
 * @author SarangiBalu A
 * ,
 */
public class TddSBA {
	
	public static void main(String[] args) {
		
		ZooSBA indianZoo = new IndianZooSBA();
		ZooSBA americanZoo = new AmericanZooSBA();
		
		AnimalSBA animal = null;
		
		animal = indianZoo.needAnimalSBA("Machali");
		System.out.println("\n\t************************** INDIAN ZOO ANIMAL ************************************"+"\n\t Animal -> "+animal+"\n\t Name   -> "+animal.getName());
		
		animal = americanZoo.needAnimalSBA("Bruce");
		System.out.println("\n\t************************* AMERICAN ZOO ANIMAL ***********************************"+"\n\t Animal -> "+animal+"\n\t Name   -> "+animal.getName());
		
	
	}

}
