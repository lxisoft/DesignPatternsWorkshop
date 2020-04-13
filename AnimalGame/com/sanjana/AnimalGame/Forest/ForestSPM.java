package com.sanjana.AnimalGame.Forest;

import com.sanjana.AnimalGame.Behaviour.*;
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
	
	public void viewDetailsSPM() {
		System.out.println("animal game");
	}
}