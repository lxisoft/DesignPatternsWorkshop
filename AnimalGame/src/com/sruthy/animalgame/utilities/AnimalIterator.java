package com.sruthy.animalgame.utilities;

import java.util.Iterator;

import com.sruthy.animalgame.factory.Animal;

/**
 * @author sruthi
 * 
 * Implemented  Iterator Pattern
 *
 */
public class AnimalIterator implements Iterator<Animal>{

	Animal[] animals;
	int count = 0;

	public AnimalIterator(Animal[] animals) {
		this.animals = animals;
	}

	@Override
	public boolean hasNext() 
	{
		if (count >= animals.length || animals[count] == null) 
		{
			return false;
		} 
		
		else {
			
			return true;
		}
	}

	@Override
	public Animal next() {
		Animal animal = animals[count];
		count += 1;
		return animal;
	}


}
