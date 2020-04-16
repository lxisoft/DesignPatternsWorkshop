package com.sruthy.animalgame;

import com.sruthy.animalgame.forest.Forest;

/**
 * @author sruthi
 *
 */
public class TDD {

	public static void main(String[] args) {

		Forest forestSKC = Forest.getInstance();

		System.out.println("Welcome to the game at" + forestSKC.toString());

		System.out.println("\nInitial SetUp");
	
		forestSKC.constructTreeHouse();
		
		forestSKC.createAnimals();
		
		forestSKC.knowAnimalBehaviours();

	}

}
