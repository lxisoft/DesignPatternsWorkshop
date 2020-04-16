package com.neeraja.animalgame.forest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.AnimalTypeConfigNrj;
import com.neeraja.animalgame.animal.EagleNrj;
import com.neeraja.animalgame.animal.LionNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.animal.adapter.EagleAdapterNrj;
import com.neeraja.animalgame.animal.animalFactory.AbstractAnimalFactoryNrj;
import com.neeraja.animalgame.animal.animalFactory.IotAnimalFactoryNrj;
import com.neeraja.animalgame.animal.animalFactory.MobileAnimalFactoryNrj;
import com.neeraja.animalgame.animal.animalFactory.WebAnimalFactoryNrj;
import com.neeraja.animalgame.animal.iterator.AnimalIteratorNrj;

public class ForestNrj {
	
	//implementing singleton pattern
private static volatile ForestNrj instance = null;
	
ArrayList<AnimalNrj> animalList= new ArrayList<AnimalNrj>();
	private ForestNrj() {
		
	}
	
	

	public static ForestNrj getInstanceNrj() {
		if(instance == null) {
			synchronized(ForestNrj.class) {
				if(instance == null) {
					instance = new ForestNrj();
				}
			}
		}
		
		return instance;
	}
	
	//client requirement
	public void createAnimal() {
		
		String animalType = null;
		AbstractAnimalFactoryNrj animalFactory;
		try {
			animalType =new AnimalTypeConfigNrj().getAnimalTypeNrj();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		switch(animalType) {
		
		case "iot":
			animalFactory = new IotAnimalFactoryNrj();
			animalList.add(animalFactory.createAnimal("tiger"));
			animalList.add(animalFactory.createAnimal("lion"));
			break;
			
		case "mobile":
			animalFactory = new MobileAnimalFactoryNrj();
			animalList.add((AnimalNrj)animalFactory.createAnimal("tiger"));
			animalList.add((AnimalNrj)animalFactory.createAnimal("eagle"));
			break;
			
		case "web":
			animalFactory = new WebAnimalFactoryNrj();
			animalList.add(animalFactory.createAnimal("lion"));
			animalList.add(animalFactory.createAnimal("eagle"));
			break;
			
		default: 
            System.out.println("no match"); 
		}
		
		displayAnimals();
	}
	
	//iterator Pattern
	
	  private void displayAnimals() {
		  AnimalIteratorNrj animalIterator=new AnimalIteratorNrj(animalList);
		while(animalIterator.hasNext()) {
			System.out.println(animalIterator.next());
		}
		
	}



	public void animalWalk() { 
		  AnimalNrj tiger = new TigerNrj();
		  AnimalNrj lion =new LionNrj();
		  AnimalNrj eagle = new EagleAdapterNrj(new EagleNrj());
		  walkingMode(tiger);
		  walkingMode(lion); 
		  walkingMode(eagle); 
		  }
	  
	  private void walkingMode(AnimalNrj animal) { 
		  animal.walkNrj(); 
		  }
	 

}
