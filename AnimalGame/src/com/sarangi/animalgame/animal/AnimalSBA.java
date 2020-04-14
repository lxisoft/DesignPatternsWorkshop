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
package com.sarangi.animalgame.animal;

/**
 * Define animal in this game
 * @author SarangiBalu A
 * ,
 */
public abstract class AnimalSBA {
	
	/**
     * name  of animal
     */
	private String name;

	/**
	 * getter for animal name
	 * 
	 * @return name name of a animal
	 *
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter for name
	 * 
	 * @param name
	 *            name of a animal
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
