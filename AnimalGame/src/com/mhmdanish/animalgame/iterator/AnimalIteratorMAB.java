package com.mhmdanish.animalgame.iterator;

import java.util.Iterator;

import com.mhmdanish.animalgame.animal.AnimalMAB;

/**
 * @author mohammed anish
 * iterator pattern
 *
 */

public class AnimalIteratorMAB implements Iterator<AnimalMAB> {
	

	AnimalMAB[] animals;
	int pos = 0;

	public AnimalIteratorMAB(AnimalMAB[] animals) {
		this.animals = animals;
	}

	@Override
	public boolean hasNext() {
		if (pos >= animals.length || animals[pos] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public AnimalMAB next() {
		AnimalMAB animal = animals[pos];
		pos += 1;
		return animal;
	}

}
