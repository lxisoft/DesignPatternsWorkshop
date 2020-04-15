package com.abdul.rafeek.animalgame.factory;
import com.abdul.rafeek.animalgame.animal.*;
import com.abdul.rafeek.animalgame.alien.*;
import java.util.*;
public abstract class AnimalGame {
 
	
	public List<AnimalARK> Start(String type,int count) {
		List<AnimalARK> animalList;
		System.out.println( "lllllllllllllllAnimalGame  start()");
		animalList = createAnimal(type,count);
		
		return animalList;
		}
		protected abstract List<AnimalARK> createAnimal(String type,int count);
	 
 
}
