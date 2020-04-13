/**
 * 
 */
package com.sruthy.animalgame;


/**
 * @author sruthi
 * 
 * Implemented Singleton Pattern
 *
 */
public class Forest 
{ 
	
	String name;

	@Override
	public String toString() {
		return name;
	}

	private static Forest forestSKC = new Forest(); 
  
    private Forest() {
    	
    	name=" Amazon";
       	
    } 
  
    public static Forest getInstance() 
    { 
        return forestSKC; 
    } 
} 
