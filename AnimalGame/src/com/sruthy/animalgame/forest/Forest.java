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
 * Animal acts as an animal abstract factory
 * IOTAnimal and WebBasedAnimal are factory methods
 * Implemented Builder Pattern and Iterator Pattern
 */
public class Forest {

	String name;
	
	ArrayList<Animal> animalList;
	
	private TreeHouseBuilder treeHouseBuilderSKC;
	
	Scanner s = new Scanner(System.in);

	private static Forest forestSKC = new Forest();

	private Forest() {

		name = " Amazon";
		animalList= new ArrayList<Animal>();
	}

	public static Forest getInstance() {
		
		return forestSKC;
	}

	
	
	/**
	 * @author sruthi
	 * 
	 * Implemented Factory Pattern
	 */
	public void createAnimals() {
		
		String animalType = null;
		Animal animalFactory;
		
		try {
			
			animalType =new AnimalTypeConfig().getAnimalType();
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		switch(animalType) {
		
		case "iot":
			animalFactory = new IOTAnimal();
			animalList.add(animalFactory.createAnimalsAndBehavioursSKC("tiger"));
			animalList.add(animalFactory.createAnimalsAndBehavioursSKC("lion"));
			animalList.add(animalFactory.createAnimalsAndBehavioursSKC("monkey"));
			
			System.out.println("\nCreated IOT animals successfully...");
				
			break;

		case "web":
			
			animalFactory = new WebBasedAnimal();
			animalList.add(animalFactory.createAnimalsAndBehavioursSKC("bear"));
			animalList.add(animalFactory.createAnimalsAndBehavioursSKC("dog"));
			animalList.add(animalFactory.createAnimalsAndBehavioursSKC("elephant"));
				
			System.out.println("\nCreated Web Based animals successfully...");
			
			break;
				
		case "mobile":
			animalFactory = new MobileBasedAnimal();
			System.out.println(animalFactory.createAnimalsAndBehavioursSKC("deer"));
			animalList.add((Animal)animalFactory.createAnimalsAndBehavioursSKC("deer"));
			animalList.add((Animal)animalFactory.createAnimalsAndBehavioursSKC("gorilla"));
			animalList.add((Animal)animalFactory.createAnimalsAndBehavioursSKC("horse"));
			System.out.println("\nCreated Mobile Based animals successfully...");
			
			break;

		}

		displayAnimals();
	}

	
	/**
	 * @author sruthi
	 * 
	 * Implemented Iterator Pattern
	 */
	private void displayAnimals() {
	
		System.out.println("\nNow the animals in the forest are :\n");
		AnimalIterator animalIterator = new AnimalIterator(animalList);
		
		while (animalIterator.hasNext()) {
			System.out.println(animalIterator.next().toString());
		}

	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
	public void knowAnimalBehaviours() {

	
			System.out.println("\n know the behaviour of different animal types\n-----------------");
			for (Animal animal : animalList) {
				System.out.println("\n"+animal.toString()+"  :");
				animal.getRunBehaviourSKC().run();
				
			}
			}
	
	/**
	 * @author sruthi
	 * 
	 * Implemented Builder Pattern
	 */

	public void constructTreeHouse() {
		treeHouseBuilderSKC= new AmazonTreeHouseBuilder();
		this.treeHouseBuilderSKC.buildClimber();
		this.treeHouseBuilderSKC.buildDoor();
		this.treeHouseBuilderSKC.buildTree();
		System.out.println("\nBuild Tree House Successfully..");
	}

	public TreeHouseBuilder getTreeHouseBuilderSKC() {
		return treeHouseBuilderSKC;
	}

	public void setTreeHouseBuilderSKC(TreeHouseBuilder treeHouseBuilderSKC) {
		this.treeHouseBuilderSKC = treeHouseBuilderSKC;
	}

}