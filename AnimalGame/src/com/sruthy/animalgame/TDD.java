package com.sruthy.animalgame;

import java.util.ArrayList;

import com.sruthy.animalgame.factory.Animal;
import com.sruthy.animalgame.forest.Forest;

/**
 * @author sruthi
 *
 */
public class TDD {

	public static void main(String[] args) {

		Forest forestSKC = Forest.getInstanceSKC();

		System.out.println("\nInitial SetUp");
	
		forestSKC.constructTreeHouseSKC();
		
		forestSKC.createAnimalsSKC();
		
		forestSKC.knowAnimalBehavioursSKC();

		startGame(forestSKC);
	}
	
	
	
	

	private static void startGame(Forest forestSKC) {
		
		
		System.out.println("\n\nWelcome to the game at" + forestSKC.toString());
		System.out.println("------------------------------");

		
		ArrayList<Animal> animalListSKC = forestSKC.getAnimalListSKC();
		
			int firstAnimal=(int)(Math.random()*3);
			int secondAnimal=(int)(Math.random()*3);
			
			System.out.println("\n"+animalListSKC.get(firstAnimal).toString()+" meets "+animalListSKC.get(secondAnimal).toString());
			System.out.println("Started fighting.................");
			
			System.out.println(animalListSKC.get(firstAnimal).toString()+"  Died..");

}
	
}
