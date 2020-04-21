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
package com.sanil.animalgame.composite;

import java.util.Iterator;

import com.sanil.animalgame.iterator.ArrayIteratorSKP;

/**
 * A forest specially designed for Animal game. The {@link ForestSKP} is
 * singleton
 * 
 * @author Sanil kumar P
 */
public class ForestSKP extends ForestComponentSKP {

	private static ForestSKP forestInstance;

	/**
	 * Name of the forest
	 */
	private final String name = "Animal game forest";

	/**
	 * Array to store animals and caves as {@link ForestComponentSKP}. It is for the
	 * implementation of composite pattern
	 */
	ForestComponentSKP[] cavesSKP = new ForestComponentSKP[10];

	/**
	 * Constructor for class ForestSKP
	 * 
	 * @param cavesSKP
	 */
	private ForestSKP() {
		super();
	}

	public ForestComponentSKP[] getCavesSKP() {
		return cavesSKP;
	}

	public void setCavesSKP(ForestComponentSKP[] cavesSKP) {
		this.cavesSKP = cavesSKP;
	}

	@Override
	public void showDetailsSKP() {

		System.out.println("____________________you are in the " + name + "____________________");
	}

	@Override
	public void addChildSKP(ForestComponentSKP forestComponentSKP) {

		for (int i = 0; i < cavesSKP.length; i++) {
			if (cavesSKP[i] != null) {
				cavesSKP[i] = forestComponentSKP;
			}
		}
	}

	/**
	 * Create iterator for {@link ForestComponentSKP} to iterate over its sub
	 * components.
	 * 
	 * @return return an array iterator
	 */
	@Override
	public Iterator<ForestComponentSKP> createIteratorSKP() {

		return new ArrayIteratorSKP(cavesSKP);
	}

	/**
	 * Static method to get the {@link ForestSKP} instance. This is the static
	 * method used to create the object of this class( Singleton pattern
	 * implemented)
	 * 
	 * @return A {@link ForestComponentSKP} instance.
	 */
	public static ForestSKP getForestInstance() {

		forestInstance = (forestInstance != null) ? forestInstance : new ForestSKP();

		return forestInstance;
	}
}
