/**
 * 
 */
package com.sruthy.animalgame.forest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sruthy.animalgame.builder.AmazonTreeHouseBuilder;
import com.sruthy.animalgame.builder.TreeHouseBuilder;
import com.sruthy.animalgame.config.AnimalTypeConfig;
import com.sruthy.animalgame.factory.Animal;
import com.sruthy.animalgame.factory.IOTAnimal;
import com.sruthy.animalgame.factory.MobileBasedAnimal;
import com.sruthy.animalgame.factory.WebBasedAnimal;
import com.sruthy.animalgame.utilities.AnimalIterator;

/**
 * @author sruthi
 * 
 * Implemented Singleton Pattern 
 * 
 * IOTAnimal and WebBasedAnimal are factory methods
 * Implemented Builder Pattern and Iterator Pattern
 */
public class Forest {

	String name;
	
	private ArrayList<Animal> animalListSKC;
	
	public ArrayList<Animal> getAnimalListSKC() {
		return animalListSKC;
	}

	public void setAnimalListSKC(ArrayList<Animal> animalListSKC) {
		this.animalListSKC = animalListSKC;
	}

	TreeHouseBuilder treeHouseBuilderSKC;
	
	Scanner s = new Scanner(System.in);

	private static Forest forestSKC = new Forest();

	private Forest() {

		name = " Amazon";
		animalListSKC= new ArrayList<Animal>();
	}

	public static Forest getInstanceSKC() {
		
		return forestSKC;
	}

	
	
	/**
	 * @author sruthi
	 * 
	 * Implemented Factory Pattern
	 */
	public void createAnimalsSKC() {
		
		String animalType = null;
		Animal animalFactorySKC;

		try {

			animalType = new AnimalTypeConfig().getAnimalType();

		} catch (IOException e) {

			e.printStackTrace();
		}

		switch (animalType) {

		case "iot":
			animalFactorySKC = new IOTAnimal();
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("tiger"));
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("lion"));
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("monkey"));

			System.out.println("\nCreated IOT animals successfully...");

			break;

		case "web":

			animalFactorySKC = new WebBasedAnimal();
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("bear"));
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("dog"));
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("elephant"));

			System.out.println("\nCreated Web Based animals successfully...");

			break;

		case "mobile":
			animalFactorySKC = new MobileBasedAnimal();
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("deer"));
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("gorilla"));
			animalListSKC.add(animalFactorySKC.createAnimalsAndBehavioursSKC("horse"));
			System.out.println("\nCreated Mobile Based animals successfully...");

			break;

		}

		displayAnimalsSKC();
	}
	
	/**
	 * @author sruthi
	 * 
	 * Implemented Iterator Pattern
	 */
	private void displayAnimalsSKC() {
	
		System.out.println("\nNow the animals in the forest are :\n");
		AnimalIterator animalIterator = new AnimalIterator(animalListSKC);
		
		while (animalIterator.hasNext()) {
			System.out.println(animalIterator.next().toString());
		}

	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
	public void knowAnimalBehavioursSKC() {

	
			System.out.println("\n know the behaviour of different animal types\n-----------------");
			for (Animal animal : animalListSKC) {
				System.out.println("\n"+animal.toString()+"  :");
				animal.getRunBehaviourSKC().run();
				
			}
			}
	
	/**
	 * @author sruthi
	 * 
	 * Implemented Builder Pattern
	 */

	public void constructTreeHouseSKC() {
		treeHouseBuilderSKC= new AmazonTreeHouseBuilder();
		this.treeHouseBuilderSKC.buildClimberSKC();
		this.treeHouseBuilderSKC.buildDoorSKC();
		this.treeHouseBuilderSKC.buildTreeSKC();
		System.out.println("\nBuild Tree House Successfully..");
	}

}