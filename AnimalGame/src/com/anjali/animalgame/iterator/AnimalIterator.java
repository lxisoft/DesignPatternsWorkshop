package com.anjali.animalgame.iterator;

import com.anjali.animalgame.animal.AnimalANJ;

/*
 * Iterator class to iterate animals array in forest
 */
public class AnimalIterator implements Iterator{
	
	private AnimalANJ[] animals;
	int position = 0;
	
	
	public AnimalIterator(AnimalANJ[] animals) {
		this.animals = animals;
	}

	@Override
	public boolean hasNext() {
		if (position >= animals.length || animals[position] == null) {
			return false;
			} else {
			return true;
			}
	}

	@Override
	public Object next() {
		AnimalANJ animal = animals[position];
		position = position + 1;
		return animal;
	}

}
