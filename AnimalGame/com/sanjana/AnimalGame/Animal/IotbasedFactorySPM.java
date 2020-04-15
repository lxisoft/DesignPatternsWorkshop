package com.sanjana.AnimalGame.Animal;

/**
 * @author sanjana p
 *
 */

public class IotbasedFactorySPM extends AnimalFactorySPM{
	
	public AnimalSPM getAnimalSPM(String type) {
		
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
	