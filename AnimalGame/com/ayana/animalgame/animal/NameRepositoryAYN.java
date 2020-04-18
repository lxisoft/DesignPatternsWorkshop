package com.ayana.animalgame.animal;

import java.util.ArrayList;

public class NameRepositoryAYN {

	public IteratorAYN getIterator() {
	      return new NameIteratorAYN();
	   }
	private class NameIteratorAYN implements IteratorAYN {

		int index;
		
		@Override
		public boolean hasNext(ArrayList<AnimalAYN> animals) {
			// TODO Auto-generated method stub
			
			if(index < animals.size()){
	            return true;
	         }
	         
			return false;
		}

		@Override
		public Object next(ArrayList<AnimalAYN> animals) {
			// TODO Auto-generated method stub
			if(this.hasNext(animals)){
	            return animals.get(index++);
	         }
	         return null;
		}
		
		
	}
}
