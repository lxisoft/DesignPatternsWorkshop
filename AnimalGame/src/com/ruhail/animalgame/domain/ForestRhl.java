package com.ruhail.animalgame.domain;

import java.util.ArrayList;
import java.util.List;

/**
* Implemented Singleton pattern for ForestRhl instance
*
* @author  Muhammed Ruhail
* @version 1.0
* @since   2020-4-13 
*/

public class ForestRhl {
	
	List<AnimalRhl> animals;
	
	private volatile static ForestRhl forestRhl;

	private ForestRhl() {
		animals=new ArrayList<AnimalRhl>();
		animals.add(new TigerRhl());
		
	}
	
	public static ForestRhl getForestRhl() {
		if(forestRhl==null) {
			synchronized(ForestRhl.class) {
				if(forestRhl==null) {
					forestRhl=new ForestRhl();
				}
			}
		}
		return forestRhl;
	}
	
	public void printDetails() {
		animals.get(0).printDetails();
		
	}
	
	
}
