package com.sruthy.animalgame;

import java.util.ArrayList;

import com.sruthy.animalgame.factory.Animal;
import com.sruthy.animalgame.forest.Forest;
import com.sruthy.animalgame.utilities.StopWatch;

/**
 * @author sruthi
 *
 */
public class TDD {

	public static void main(String[] args) throws Exception{

		Forest forestSKC = Forest.getInstanceSKC();

		System.out.println("\nInitial SetUp");
	
		forestSKC.constructTreeHouseSKC();
		
		Thread.sleep(4000);
		
		System.out.println("\nLet's Watch The Game From Here");
		
		forestSKC.createAnimalsSKC();
		
		Thread.sleep(4000);
		
		forestSKC.knowAnimalBehavioursSKC();

		startGame(forestSKC);
	}
	
	
	
	

	private static void startGame(Forest forestSKC) throws InterruptedException {
		StopWatch stopWatch = new StopWatch();
		
		System.out.println("\n\nWelcome to the game at" + forestSKC.toString());
		System.out.println("------------------------------");

		
		ArrayList<Animal> animalListSKC = forestSKC.getAnimalListSKC();
		
			int firstAnimal=(int)(Math.random()*3);
			int secondAnimal=(int)(Math.random()*3);
			
			System.out.println("\n"+animalListSKC.get(firstAnimal).toString()+" meets "+animalListSKC.get(secondAnimal).toString());
			System.out.println("Started fighting.................");
			
			stopWatch.start();
			
			
			Thread.sleep(4000);
			
	
			System.out.println(animalListSKC.get(firstAnimal).toString()+"  Died..");
			
			
			System.out.println("\nThe winner is "+animalListSKC.get(secondAnimal).toString());

}
	
}
