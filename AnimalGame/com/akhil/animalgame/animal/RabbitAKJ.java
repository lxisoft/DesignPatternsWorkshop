package com.akhil.animalgame.animal;

import com.akhil.animalgame.behavior.EatBehaviorAKJ;
import com.akhil.animalgame.behavior.HerbivorousAKJ;

/**
 * @author Akhil
 * 
 * Implemented Singleton Pattern
 *
 */

public class RabbitAKJ extends AnimalAKJ {
	
	private String name;


	@Override
	public String eatAKJ() {
		
		
		return "Rabbit eating grass..";
	}
	
	 public RabbitAKJ(String name) {
		 this.name =name;
		 
	 }
	 public RabbitAKJ() {
		 eatBehaviourAKJ = new HerbivorousAKJ();
	 }
	 
	 @Override
		public String toString() {

			return  name;
		}


}
