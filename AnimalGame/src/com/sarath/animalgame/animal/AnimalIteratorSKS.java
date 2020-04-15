package com.sarath.animalgame.animal;

import java.util.Iterator;

public class AnimalIteratorSKS implements Iterator<AnimalSKS> {
	

	AnimalSKS[] animals;
	int pos = 0;

	public AnimalIteratorSKS(AnimalSKS[] animals) {
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
	public AnimalSKS next() {
		AnimalSKS animal = animals[pos];
		pos += 1;
		return animal;
	}

}
