package com.neeraja.animalgame.animal.iterator;

import java.util.ArrayList;

import com.neeraja.animalgame.animal.AnimalNrj;

public class AnimalIteratorNrj implements Iterator{
	ArrayList<AnimalNrj> animals;
	int position = 0;
	
	public AnimalIteratorNrj(ArrayList<AnimalNrj> animals) {
	this.animals = animals;
	}
	
	
	public AnimalNrj next() {
	AnimalNrj animal = animals.get(position);
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
