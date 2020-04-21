package com.anjali.animalgame.animal;

import com.anjali.animalgame.factory.AnimalFactory;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;

public class AfricanRabbitANJ extends RabbitANJ{

	public static class Builder {

		private String animalName;	
		private Boolean isAlive=true;
		
		/*
		 * Strategy Behaviour Composition
		 */
		protected FoodEatBehaviourANJ foodEatBehaviour; 
		
		
		public Builder animalName(String animalName){
            this.animalName = animalName;
            return this;  
        }
		
		public Builder isAlive(Boolean isAlive){
            this.isAlive = isAlive;
            return this;  
        }
		
		public Builder foodEatBehaviour(FoodEatBehaviourANJ foodEatBehaviour){
            this.foodEatBehaviour = foodEatBehaviour;
            return this;  
        }
		
		 public AnimalANJ build(){
			 AfricanRabbitANJ animal=new AfricanRabbitANJ();  
			 animal.setAnimalName(this.animalName);
			 animal.setIsAlive(this.isAlive);
			 animal.setFoodEatBehaviour(this.foodEatBehaviour);
			 return animal;
	        }
		
	 }
	 
}
