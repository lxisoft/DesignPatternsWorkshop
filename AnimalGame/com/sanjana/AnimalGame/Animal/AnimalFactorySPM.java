package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Forest.ForestSPM;

/**
 * @author sanjana p
 *
 */

public class AnimalFactorySPM {
	
	private volatile static AnimalFactorySPM animalFactory;
	 
	private AnimalFactorySPM() {
		
	}
	 
	public static AnimalFactorySPM getInstance() {        
		if (animalFactory == null) {            
			synchronized (AnimalFactorySPM.class) {               
				if (animalFactory == null) {                    
					animalFactory = new AnimalFactorySPM();               
				  	}            
				}       
			}        
		  return animalFactory; 
		}
	
	public AnimalSPM getAnimalSPM(String type) 
	{   
		AnimalSPM animal=null;
		
		if (type.equals("tiger")) {        
			animal = new TigerSPM();    
		} else if(type.equals("lion")) {        
			animal = new LionSPM();    
		} else if(type.equals("rabbit")) {        
			animal = new RabbitSPM();    
		} else if(type.equals("deer")) {        
			animal = new DeerSPM();    
		} 
		return animal;
	}
	
	

	
}