package com.neeraja.animalgame.test;

import com.neeraja.animalgame.forest.ForestNrj;

public class Tdd {

	public static void main(String[] args) {
		ForestNrj forest = ForestNrj.getInstanceNrj();
		forest.animalSound();
		System.out.println(forest);
//		forest.animalGame();
	
	}

}
