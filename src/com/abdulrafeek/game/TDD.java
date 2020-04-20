package com.abdulrafeek.game;

import com.abdulrafeek.game.animal.*;
import com.abdulrafeek.game.level.*;
public class TDD {

	public static void main(String[] args) {
		

		AnimalGame levelFactory = new Level0Factory(); 
		levelFactory.createAnimalArmy("Lion",4);
		levelFactory.createAnimalArmy("Tiger",2);
		levelFactory.createAnimalArmy("Fox",1);
		levelFactory.createAnimalArmy("WoodPecker",1);
		levelFactory.fight();
		levelFactory.display();
		
		//AnimalARK a = new LionARK();
		//a.testName();
		
	}

}
