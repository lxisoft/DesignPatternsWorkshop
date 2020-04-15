/**
 * 
 */
package com.mhmdanish.animalgame;

import java.io.IOException;

import com.mhmdanish.animalgame.config.AnimalTypeConfigMAB;
import com.mhmdanish.animalgame.forest.ForestMAB;

/**
 * @author mohammed anish
 *
 */
public class Tdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ForestMAB forest = ForestMAB.getInstanceMAB();
		forest.createAnimal();
		forest.roamAnimalMAB();
		forest.eatMAB();
	}

}
