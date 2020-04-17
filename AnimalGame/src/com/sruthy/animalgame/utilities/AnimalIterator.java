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

	ArrayList<Animal> animalsSKC;
	int position = 0;

	public AnimalIterator(ArrayList<Animal> animalsSKC) {
		this.animalsSKC = animalsSKC;
	}

	public Animal next() {
		Animal animal = animalsSKC.get(position);
		position = position + 1;
		return animal;
	}

	public boolean hasNext() {
		
		if (position >= animalsSKC.size() || animalsSKC.get(position) == null) {
			
			return false;
	
		} else {
			
			return true;
		}
	}
}
