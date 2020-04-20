/**
 * 
 */
package com.abdulrafeek.game;
import java.util.*;
import com.abdulrafeek.game.animal.AnimalARK;
import com.abdulrafeek.game.animal.LionARK;

/**
 * @author rafeek
 * Abstract creator 
 */
public abstract class AnimalGame {
	
	 List<AnimalARK> animalArmy = new ArrayList<>();
		public void createAnimalArmy(String type,int numberOfAnimals ){
			
			for(int i=0;i<numberOfAnimals;i++) {
				AnimalARK a=	createAnimal(type);
				animalArmy.add(a);
				
			}
			System.out.println("animalArmy size" +animalArmy.size());
		
		}
		
		
	
	
	
	public void  display(){
		for(AnimalARK animal : animalArmy ) {
			System.out.println("animalArmy size" +animal.getName());
		}
	}
	//change to template
	public void fight() {
		for(AnimalARK animal : animalArmy ) {
			animal.performFight();
		}
	}
	
	/*Abstract factory method,
	All the responsibility for instantiating Animals has been	moved into a method that
	acts as a factory*/
	public abstract AnimalARK createAnimal(String type);



	

}
