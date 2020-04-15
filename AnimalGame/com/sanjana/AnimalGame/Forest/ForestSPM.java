package com.sanjana.AnimalGame.Forest;

import java.io.IOException;

import com.sanjana.AnimalGame.Animal.AnimalFactorySPM;
import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Animal.IotbasedFactorySPM;
import com.sanjana.AnimalGame.Animal.MobilebasedFactorySPM;
import com.sanjana.AnimalGame.Animal.TigerSPM;
import com.sanjana.AnimalGame.Animal.WebbasedFactorySPM;
import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.Configuration.AnimalConfigurationSPM;
/**
 * @author sanjana p
 *
 */
public class ForestSPM{
	
	private volatile static ForestSPM forest;
	 
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
		switch (type) {
		case "iot":
			animal = new IotbasedFactorySPM();
			break;
		case "mobile":
			animal = new MobilebasedFactorySPM();
			break;
		case "web":
			animal = new WebbasedFactorySPM();
			break;
		}

		System.out.println(animal.getAnimalSPM("tiger").featureSPM());
		System.out.println(animal.getAnimalSPM("lion").featureSPM());
		System.out.println(animal.getAnimalSPM("rabbit").featureSPM());
		System.out.println(animal.getAnimalSPM("deer").featureSPM());
		

	}

	
	}
	