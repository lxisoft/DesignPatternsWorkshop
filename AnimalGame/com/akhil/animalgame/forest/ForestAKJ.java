package com.akhil.animalgame.forest;

/**
 * @author Akhil
 * 
 * Implemented Singleton Pattern
 *
 */

public class ForestAKJ {

	
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
} 

