package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Factory.AnimalFactorySPM;

/**
 * @author sanjana p
 *
 */

public class IotbasedFactorySPM extends AnimalFactorySPM{
	
	public AnimalSPM getAnimalSPM(String type) {
		
		AnimalSPM animal=null;
		
		if (type.equals("tiger")) {        
			animal = new WildTigerSPM();    
		} else if(type.equals("lion")) {        
			animal = new WildLionSPM();    
		} else if(type.equals("rabbit")) {        
			animal = new WildRabbitSPM();    
		} else if(type.equals("deer")) {        
			animal = new WildDeerSPM();    
		} 
		return animal;
	}
		
	}
	