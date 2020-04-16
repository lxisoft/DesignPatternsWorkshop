package com.sruthy.animalgame.utilities;

import java.util.ArrayList;
import java.util.Iterator;

import com.sruthy.animalgame.factory.Animal;

/**
 * @author sruthi
 * 
 * Implemented Iterator Pattern
 *
 */
public class AnimalIterator implements Iterator<Animal> {

	ArrayList<Animal> animals;
	int position = 0;

	public AnimalIterator(ArrayList<Animal> animals) {
		this.animals = animals;
	}

	public Animal next() {
		Animal animal = animals.get(position);
		position = position + 1;
		return animal;
	}

	public boolean hasNext() {
		
		if (position >= animals.size() || animals.get(position) == null) {
			
			return false;
	
		} else {
			
			return true;
		}
	}
}
