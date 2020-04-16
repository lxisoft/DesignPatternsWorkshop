package com.sanjana.AnimalGame.Iterator;

import java.util.ArrayList;

import com.sanjana.AnimalGame.Animal.AnimalSPM;

/**
 * @author sanjana p
 *
 */
public class AnimalIteratorSPM implements IteratorSPM{
	ArrayList<AnimalSPM> animals;
	int index;
	public AnimalIteratorSPM(ArrayList<AnimalSPM> animals) {
		this.animals = animals;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		 if (index >= animals.size() || animals.get(index) == null ){
		return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public Object next() {
		AnimalSPM animal = animals.get(index);
		index= index+1;
		return animal;
		// TODO Auto-generated method stub
		
	}

	
}
