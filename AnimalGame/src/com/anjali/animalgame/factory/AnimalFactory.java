package com.anjali.animalgame.factory;

import com.anjali.animalgame.animal.AnimalANJ;

public interface AnimalFactory {

	public abstract AnimalANJ createLion(); 
	
	public abstract AnimalANJ createTiger(); 
	
	public abstract AnimalANJ createDeer(); 
	
	public abstract AnimalANJ createRabbit(); 
	
	public abstract AnimalANJ createBear(); 
	
	
}
