/**
 * 
 */
package com.sruthy.animalgame;

import java.util.Scanner;

import com.sruthy.animalgame.animal.IOTAnimal;
import com.sruthy.animalgame.animal.WebBasedAnimal;

/**
 * @author sruthi
 * 
 * Implemented Singleton Pattern 
 * Animal acts as an animal abstract factory
 * IOTAnimal and WebBasedAnimal are factory methods
 */
public class Forest {

	String name;
	IOTAnimal iOTAnimalSKC;
	WebBasedAnimal webBasedAnimalSKC;
	
	Scanner s = new Scanner(System.in);

	private static Forest forestSKC = new Forest();

	private Forest() {

		name = " Amazon";

	}

	public static Forest getInstance() {
		return forestSKC;
	}

	public void createAnimals() {
		
		int a = 0;
		while (a < 3) {
			System.out.println("\nwhich type of animal you wanna create ?\n-----------------");
			System.out.println("1. IOT " + "2. WEB BASED " + "3. Exit\nChoice:");

			a = s.nextInt();

			switch (a) {
			case 1:
				iOTAnimalSKC = new IOTAnimal();

				iOTAnimalSKC.createAnimalsAndBehavioursSKC();
				System.out.println("Created IOT animals successfully");

				break;

			case 2:
				webBasedAnimalSKC = new WebBasedAnimal();

				webBasedAnimalSKC.createAnimalsAndBehavioursSKC();
				System.out.println("Created Web Based animals successfully");
				break;

			case 3:
				System.out.println("Came out of the game");
				break;
			}
		}

	}

	@Override
	public String toString() {
		return name;
	}

	public void knowAnimalBehaviours() {

	
		int a = 0;
		while (a != 3) 
		{
			System.out.println("\n Choose from options to know the behaviour?\n-----------------");
			System.out.println("1. white Tiger " + "2. Bengal Tiger" + "3. Stop Game\nChoice:");

			a = s.nextInt();
			try
			{
			switch (a) {
			case 1:
				
				iOTAnimalSKC.getWhiteTigerSKC().getRunBehaviourSKC().run();;
				break;

			case 2:
				webBasedAnimalSKC.getBengalTigerSKC().getRunBehaviorSKC().run();
				break;
			}}
			catch(NullPointerException e) {
				System.out.println("This type of animal is not present. Create one? (y/n)");
				String yesorno =s.next();
				while(yesorno.equals("y"))
				{
					createAnimals();
				}
			}
		}
		
		System.out.println("Game Over");
	}

}
