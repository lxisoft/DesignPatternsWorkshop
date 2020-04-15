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
package com.sarangi.animalgame.animalBehaviour;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class AggressiveBehaviourSBA implements AnimalBehaviourSBA{

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.animalBehaviour.AnimalBehaviourSBA#FightBehaviourSBA()
	 */
	@Override
	public void FightBehaviourSBA() {
		System.out.println("\n\t Aggression is defined as threats or harmful actions directed toward another individual \n\t can include threat displays, lunging, growling, snarling, snapping, and biting.\n\t In animals, aggressive behaviors are a means of communication.\n\t");
		
	}
	
	@Override
	public String toString() {
		return "AggressiveBehaviour";
	}


}
