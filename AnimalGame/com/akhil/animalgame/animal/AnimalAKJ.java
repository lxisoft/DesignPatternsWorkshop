package com.akhil.animalgame.animal;

import com.akhil.animalgame.behavior.EatBehaviorAKJ;

/**
 * @author Akhil
 * 
 *
 */


public abstract class AnimalAKJ {

	public abstract String eatAKJ();
	
	EatBehaviorAKJ eatBehaviourAKJ;
		

	public String setEatAKJ(){

		String type = eatBehaviourAKJ.eatAKJ();
		return type;
	}

	
	
}
