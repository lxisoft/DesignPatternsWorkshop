package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Forest.ForestSPM;

/**
 * @author sanjana p
 *
 */

public abstract class AnimalFactorySPM {
	
	
	public abstract AnimalSPM getAnimalSPM(String type);
//	private volatile static AnimalFactorySPM animalFactory;
//	 
//	private AnimalFactorySPM() {
//		
//	}
//	 
//	public static AnimalFactorySPM getInstance() {        
//		if (animalFactory == null) {            
//			synchronized (AnimalFactorySPM.class) {               
//				if (animalFactory == null) {                    
//					animalFactory = new AnimalFactorySPM();               
//				  	}            
//				}       
//			}        
//		  return animalFactory; 
//		}

	
}