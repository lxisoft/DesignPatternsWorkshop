package com.greeshma.animalgame;

import com.greeshma.animalgame.forest.ForestGCG;

public class TDD {

	public static void main(String[] args) {
		ForestGCG f= ForestGCG.getInstanceGCG();
		
		f.createAnimal();
		f.eatGCG();
	}

}