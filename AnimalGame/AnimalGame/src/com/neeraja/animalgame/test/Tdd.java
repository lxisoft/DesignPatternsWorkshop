package com.neeraja.animalgame.test;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.LionNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.forest.ForestNrj;

public class Tdd {

	public static void main(String[] args) {
		
		//Singleton and adapter
		ForestNrj forest = ForestNrj.getInstanceNrj();
		forest.animalWalk();
		System.out.println(forest);
		//Strategy
		AnimalNrj tigerNrj=new TigerNrj();
		tigerNrj.setEatNrj();
		
		//clientRequirement
		//factory,decorator, iterator
		forest.createAnimal();
		
		//Command Pattern
		forest.undoAction();
		
		//Facadepattern
		forest.createHouse();
		
		//statePattern
		forest.checkEnergyState(tigerNrj);
		
		//Template Pattern
		System.out.println();
		tigerNrj.performAction();
		System.out.println();
		AnimalNrj lion= new LionNrj();
		lion.performAction();
		
	}

}
