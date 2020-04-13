package com.neeraja.animalgame.test;

import com.neeraja.animalgame.forest.ForestNrj;

public class Tdd {

	public static void main(String[] args) {

		ForestNrj forest=new ForestNrj();
		
		String forestName=forest.getNameNrj();
		
		System.out.println("=================================================");
		System.out.println("              ---"+forestName+" FOREST---   ");
		System.out.println("=================================================");
		
//		forest.animalGame();
	
	}

}
