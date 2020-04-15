package com.akhil.animalgame.animal;
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

}
