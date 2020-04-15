package com.neeraja.animalgame.test;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.TigerNrj;
import com.neeraja.animalgame.forest.ForestNrj;

public class Tdd {

	public static void main(String[] args) {
		
		//Singleton and adapter
		ForestNrj forest = ForestNrj.getInstanceNrj();
		forest.animalSound();
		System.out.println(forest);
		//Strategy
		AnimalNrj tigerNrj=new TigerNrj();
		tigerNrj.setEat();
	}

}
