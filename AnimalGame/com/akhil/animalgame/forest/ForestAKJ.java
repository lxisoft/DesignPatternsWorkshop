package com.akhil.animalgame.forest;

import com.akhil.animalgame.animal.AnimalAKJ;
import com.akhil.animalgame.animal.AnimalFactoryAKJ;

/**
 * @author Akhil
 * 
 * Implemented Singleton Pattern
 *
 */

public class ForestAKJ {
	
	AnimalAKJ tiger;
	AnimalAKJ lion;
	AnimalAKJ rabbit;
	AnimalAKJ deer;
	
	String name;

	@Override
	public String toString() {
		return name;
	}

	private static ForestAKJ forest = new ForestAKJ(); 
  
    private ForestAKJ() {
    	
    	name="Muthanga";
       	
    } 
  
    public static ForestAKJ getInstance() 
    { 
        return forest; 
    } 
    
    public void createAnimal() {
    	// creating animal using factory pattern
    	AnimalFactoryAKJ animal = AnimalFactoryAKJ.getInstance();
    	System.out.print(animal.getAnimal("tiger").eatAKJ());
    }
} 

