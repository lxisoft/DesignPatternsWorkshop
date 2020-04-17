package com.sanjana.AnimalGame.Forest;

import java.io.IOException;
import java.util.ArrayList;

import com.sanjana.AnimalGame.Factory.*;
import com.sanjana.AnimalGame.Iterator.AnimalIteratorSPM;
import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.Configuration.AnimalConfigurationSPM;
import com.sanjana.AnimalGame.Decorator.AngryDeerSPM;
/**
 * @author sanjana p
 *
 */
public class ForestSPM{
	
	ArrayList<AnimalSPM> animals = new ArrayList<>();
	private volatile static ForestSPM forest;
	AnimalSPM deer;
	 
	private ForestSPM() {
		
	}
	 
	public static ForestSPM getInstance() {        
		if (forest == null) {            
			synchronized (ForestSPM.class) {               
				if (forest == null) {                    
					forest = new ForestSPM();               
				  	}            
				}       
			}        
		  return forest; 
		}
	public void createAnimalSPM() {
		AnimalConfigurationSPM instance = AnimalConfigurationSPM.getInstance();

		String type = instance.getType();
		System.out.println("The animal of type " +type);
		AnimalFactorySPM animal = null;
		AngryDeerSPM angdeer = null;
		switch (type) {
		case "iot":
			animal = new IotbasedFactorySPM();
			animals.add(animal.getAnimalSPM("tiger"));
			animals.add(animal.getAnimalSPM("lion"));
			animals.add(animal.getAnimalSPM("rabbit"));
			animals.add(animal.getAnimalSPM("deer"));
			break;
		case "mobile":
			animal = new MobilebasedFactorySPM();
			animals.add(animal.getAnimalSPM("rabbit"));
			animals.add(animal.getAnimalSPM("deer"));
			animals.add(animal.getAnimalSPM("lion"));
			animals.add(animal.getAnimalSPM("tiger"));
			break;
		case "web":
			animal = new WebbasedFactorySPM();
			animals.add(animal.getAnimalSPM("rabbit"));
			animals.add(animal.getAnimalSPM("deer"));
			animals.add(animal.getAnimalSPM("tiger"));
			animals.add(animal.getAnimalSPM("lion"));
			break;
		}
//to check weather feature is visible
		System.out.println(animal.getAnimalSPM("tiger").featureSPM());
		System.out.println(animal.getAnimalSPM("lion").featureSPM());
		System.out.println(animal.getAnimalSPM("rabbit").featureSPM());
		System.out.println(animal.getAnimalSPM("deer").featureSPM());
//to check weather strength is visible
		System.out.println(animal.getAnimalSPM("tiger").strengthSPM());
		System.out.println(animal.getAnimalSPM("lion").strengthSPM());
		System.out.println(animal.getAnimalSPM("rabbit").strengthSPM());
		System.out.println(animal.getAnimalSPM("deer").strengthSPM());

		//
		System.out.println("*****************************");
		angdeer = new AngryDeerSPM(deer);
		System.out.println("angry deer strength" +angdeer.strengthSPM());
		
		viewAnimalsSPM();
	}
	
	public void viewAnimalsSPM() {
		AnimalIteratorSPM animaliterator = new AnimalIteratorSPM(animals);
		while(animaliterator.hasNext()){
			System.out.println(animaliterator.next());
			
		}
		
	
	
	
}
	
	}
	