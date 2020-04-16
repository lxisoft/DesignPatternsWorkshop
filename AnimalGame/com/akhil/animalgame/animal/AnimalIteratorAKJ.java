package com.akhil.animalgame.animal;

import java.util.Iterator;
import java.util.List;

/**
 * @author Akhil johnson 
 * iterator pattern
 *
 */

public class AnimalIteratorAKJ implements Iterator<AnimalAKJ> {

	public AnimalIteratorAKJ(List<AnimalAKJ> animals) {
		this.animals = animals;
	}

	List<AnimalAKJ> animals;

	int pos = 0;

	@Override
	public boolean hasNext() {
		System.out.println(animals);
		if (pos < animals.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public AnimalAKJ next() {
		AnimalAKJ animal = animals.get(pos);
		pos++;
		return animal;
	}

}
