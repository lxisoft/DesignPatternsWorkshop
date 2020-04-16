package com.sruthy.animalgame.test;

import com.sruthy.animalgame.forest.Forest;

/**
 * @author sruthi
 *
 */
public class TDD {

	public static void main(String[] args) {

		Forest forestSKC = Forest.getInstance();

		System.out.println("Welcome to the game at" + forestSKC.toString());

		System.out.println("We can know about the animal behaviours");
	
		forestSKC.createAnimals();
		
		forestSKC.knowAnimalBehaviours();

	}

}
