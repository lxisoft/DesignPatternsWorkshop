package com.greeshma.animalgame.iterator;

import java.util.Iterator;

import com.greeshma.animalgame.animal.AnimalGCG;

public class AnimalIteratorGCG implements Iterator {
	AnimalGCG[] animals;
	int pos = 0;

	public AnimalIteratorGCG(AnimalGCG[] animals) {
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
	public AnimalGCG next() {
		AnimalGCG animal = animals[pos];
		pos += 1;
		return animal;
	}
}
