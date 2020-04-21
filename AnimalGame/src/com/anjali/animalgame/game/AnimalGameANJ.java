package com.anjali.animalgame.game;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.factory.creator.AfricanAnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.AnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.AsianAnimalCreatorANJ;
import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.iterator.Iterator;
import com.anjali.animalgame.strategy.FoodEatBehaviourANJ;
import com.anjali.animalgame.strategy.impl.Carnivore;
import com.anjali.animalgame.strategy.impl.Herbivore;
import com.anjali.animalgame.strategy.impl.Omnivore;
import com.anjali.animalgame.template.GameTemplateANJ;

/*
 * Template method implemented in animal game. This steps can be implemented in any other similar games
 */
public class AnimalGameANJ extends GameTemplateANJ{

	private ForestANJ forest;
	
	@Override
	public void setGame() {
		
		forest=ForestANJ.getInstance();   //Singleton pattern
		forest.setForestRegion("african");
		
		AnimalCreatorANJ animalCreator=new AsianAnimalCreatorANJ();  
		
		AnimalANJ createdAnimal1=animalCreator.create("DeerANJ"); 
		AnimalANJ createdAnimal2=animalCreator.create("DeerANJ"); 
		AnimalANJ createdAnimal3=animalCreator.create("DeerANJ"); 
		AnimalANJ createdAnimal4=animalCreator.create("DeerANJ");
		AnimalANJ createdAnimal5=animalCreator.create("LionANJ");
		AnimalANJ createdAnimal6=animalCreator.create("TigerANJ"); 
		AnimalANJ createdAnimal7=animalCreator.create("TigerANJ"); 	
		AnimalANJ createdAnimal8=animalCreator.create("BearANJ"); 
		AnimalANJ createdAnimal9=animalCreator.create("RabbitANJ"); 
		AnimalANJ createdAnimal10=animalCreator.create("RabbitANJ"); 
			
		forest.getAnimals()[0]=createdAnimal1;
		forest.getAnimals()[1]=createdAnimal2;
		forest.getAnimals()[2]=createdAnimal3;
		forest.getAnimals()[3]=createdAnimal4;
		forest.getAnimals()[4]=createdAnimal5;
		forest.getAnimals()[5]=createdAnimal6;
		forest.getAnimals()[6]=createdAnimal7;
		forest.getAnimals()[7]=createdAnimal8;
		forest.getAnimals()[8]=createdAnimal9;
		forest.getAnimals()[9]=createdAnimal10;
		
		/**
		 * Before Facade pattern implementation
		 */
		//forest.getAnimals()[0].setAnimalName("Deer 1");  
														
		/**
		 * Implement Facade pattern to avoid the coupling of method calls
		 */								
		//forest.setAnimalDetails();
		
		System.out.println("Forest and animals created"); 
	
	}

	@Override
	public void startGame() {
		System.out.println("Animals in the forest are");
		
		Iterator animalIterator=forest.createIterator();            /* invoke animal iterator for displaying animals */
		printAnimals(animalIterator);
		
		System.out.println("/n");
		int noOfAnimals=10;
		
		/*do{		
			int firstAnimal=(int)(Math.random()*10);
			int secondAnimal=(int)(Math.random()*10);
			
			if((forest.getAnimals()[firstAnimal].getIsAlive()==true)&&(forest.getAnimals()[secondAnimal].getIsAlive()==true)&&(firstAnimal!=secondAnimal))
			{
				System.out.println(forest.getAnimals()[firstAnimal].getAnimalName()+" meets"+forest.getAnimals()[secondAnimal].getAnimalName());
				System.out.println(forest.getAnimals()[firstAnimal]);
				System.out.println(forest.getAnimals()[secondAnimal]);
				
				forest.makeAnimalsMeet(forest.getAnimals()[firstAnimal], forest.getAnimals()[secondAnimal]);
				
				if((forest.getAnimals()[firstAnimal].getIsAlive()==false)||(forest.getAnimals()[secondAnimal].getIsAlive()==false)){
					noOfAnimals--;
				}
			}
			}while(noOfAnimals>1);//end of dowhile
			*/
		if(noOfAnimals==1){
			showResult();
		}
	}

	@Override
	public void showResult() {
		//AnimalANJ winner=null;
		/*for(int j=0;j<10;j++){
			if(forest.getAnimals()[j].isAlive()==true){
				System.out.println(forest.getAnimals()[j].getAnimalName()+" left in the forest");
				System.out.println(forest.getAnimals()[j].getAnimalName()+" is the winner");
				//winner=forest.getAnimals()[j];
			}
		}*/
	}

	/*
	 * Displys animals in array using Iterator without exposing the animal type
	 */
	public void printAnimals(Iterator iterator) {
		System.out.println("inside print animals using iterator");
		while (iterator.hasNext()) {
			AnimalANJ animal = (AnimalANJ)iterator.next();
		//	System.out.print(animal.getAnimalName() + "");
			System.out.println("\n");
		}
	}
	


}
