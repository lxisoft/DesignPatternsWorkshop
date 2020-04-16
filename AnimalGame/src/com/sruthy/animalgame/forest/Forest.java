/**
 * 
 */
package com.sruthy.animalgame.forest;

import java.util.Scanner;

import com.sruthy.animalgame.factory.Animal;
import com.sruthy.animalgame.factory.IOTAnimal;
import com.sruthy.animalgame.factory.MobileBasedAnimal;
import com.sruthy.animalgame.factory.WebBasedAnimal;
import com.sruthy.animalgame.utilities.AnimalIterator;

/**
 * @author sruthi
 * 
 * Implemented Singleton Pattern 
 * Animal acts as an animal abstract factory
 * IOTAnimal and WebBasedAnimal are factory methods
 */
public class Forest {

	String name;
	IOTAnimal[] iOTAnimalSKC;
	WebBasedAnimal[] webBasedAnimalSKC;
	MobileBasedAnimal[] mobileBasedAnimalSKC;
	
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
		while (a < 4) {
			
			System.out.println("\nwhich type of animal you wanna create ?\n-----------------");
			System.out.println("1. IOT " + "2. WEB BASED " + "3.MOBILE BASED "+ "4.Exit\nChoice:");

			a = s.nextInt();
			
			iOTAnimalSKC = new IOTAnimal[3];
			webBasedAnimalSKC = new WebBasedAnimal[3];
			mobileBasedAnimalSKC = new MobileBasedAnimal[3];
			
			Animal animal=null;
			
			switch (a) {
			case 1:
				animal = new IOTAnimal();
				animal.createAnimalsAndBehavioursSKC("lion");
				iOTAnimalSKC[0]=(IOTAnimal) animal.createAnimalsAndBehavioursSKC("tiger");
				iOTAnimalSKC[1]=(IOTAnimal) animal.createAnimalsAndBehavioursSKC("lion");
				iOTAnimalSKC[2]=(IOTAnimal) animal.createAnimalsAndBehavioursSKC("monkey");
				
				System.out.println("Created IOT animals successfully");
				
			break;

			case 2:
				animal = new WebBasedAnimal();

				webBasedAnimalSKC[0]= (WebBasedAnimal) animal.createAnimalsAndBehavioursSKC("beer");
				webBasedAnimalSKC[1]= (WebBasedAnimal) animal.createAnimalsAndBehavioursSKC("dog");
				webBasedAnimalSKC[2]= (WebBasedAnimal) animal.createAnimalsAndBehavioursSKC("elephant");
				System.out.println("Created Web Based animals successfully");
				break;
				
			case 3:
				animal = new WebBasedAnimal();

				mobileBasedAnimalSKC[0]= (MobileBasedAnimal) animal.createAnimalsAndBehavioursSKC("deer");
				mobileBasedAnimalSKC[1]= (MobileBasedAnimal) animal.createAnimalsAndBehavioursSKC("gorilla");
				mobileBasedAnimalSKC[2]= (MobileBasedAnimal) animal.createAnimalsAndBehavioursSKC("horse");
				System.out.println("Created Mobile Based animals successfully");
				break;

			case 4:
				
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
			System.out.println("\n Choose from options to know the behaviour of different animal types\n-----------------");
			System.out.println("1. IOTAnimal " + "2. MobileBasedAnimal " + "3. Stop Game\nChoice:");

			a = s.nextInt();
			try
			{
			switch (a) {
			case 1:
				IOTAnimal iotAnimal = new IOTAnimal();
				iotAnimal.getRunBehaviourSKC().run();
				break;

			case 2:
				(new MobileBasedAnimal()).getRunBehaviourSKC().run();
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
		s.close();
		System.exit(0);
	}

}
