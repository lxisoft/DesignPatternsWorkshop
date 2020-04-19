package com.anjali.animalgame.game;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.factory.creator.AfricanAnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.AnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.AsianAnimalCreatorANJ;
import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.iterator.Iterator;
import com.anjali.animalgame.template.GameTemplateANJ;

/*
 * Template method implemented in animal game. This steps can be implemented in any other similar games
 */
public class AnimalGameANJ extends GameTemplateANJ{

	private ForestANJ forest;
	
	@Override
	public void setGame() {
		
		forest=ForestANJ.getInstance();   //Singleton pattern
		
		/*invoked factory creator for creating animals: factory pattern
		*
		*/
		AnimalCreatorANJ africanAnimalCreator=new AfricanAnimalCreatorANJ();  
		AnimalCreatorANJ asianAnimalCreator=new AsianAnimalCreatorANJ();
		
		AnimalANJ createdAnimal1=africanAnimalCreator.createAnimalANJ("DeerANJ"); 
		AnimalANJ createdAnimal2=asianAnimalCreator.createAnimalANJ("DeerANJ"); 
		AnimalANJ createdAnimal3=asianAnimalCreator.createAnimalANJ("DeerANJ"); 
		AnimalANJ createdAnimal4=africanAnimalCreator.createAnimalANJ("DeerANJ"); 
		AnimalANJ createdAnimal5=africanAnimalCreator.createAnimalANJ("LionANJ"); 
		AnimalANJ createdAnimal6=asianAnimalCreator.createAnimalANJ("TigerANJ"); 
		AnimalANJ createdAnimal7=africanAnimalCreator.createAnimalANJ("TigerANJ"); 
		AnimalANJ createdAnimal8=africanAnimalCreator.createAnimalANJ("BearANJ"); 
		AnimalANJ createdAnimal9=asianAnimalCreator.createAnimalANJ("RabbitANJ"); 
		AnimalANJ createdAnimal10=africanAnimalCreator.createAnimalANJ("RabbitANJ"); 
			
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
		forest.setAnimalDetails();
		
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
			
			if((forest.getAnimals()[firstAnimal].isAlive()==true)&&(forest.getAnimals()[secondAnimal].isAlive()==true)&&(firstAnimal!=secondAnimal))
			{
				System.out.println(forest.getAnimals()[firstAnimal].getAnimalName()+" meets"+forest.getAnimals()[secondAnimal].getAnimalName());
				forest.getAnimals()[firstAnimal].meetAnotherAnimalANJ(forest.getAnimals()[secondAnimal]);
				System.out.println("\n");
			
				if((forest.getAnimals()[firstAnimal].isAlive()==false)||(forest.getAnimals()[secondAnimal].isAlive()==false)){
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
		for(int j=0;j<10;j++){
			if(forest.getAnimals()[j].isAlive()==true){
				System.out.println(forest.getAnimals()[j].getAnimalName()+" left in the forest");
				System.out.println(forest.getAnimals()[j].getAnimalName()+" is the winner");
				//winner=forest.getAnimals()[j];
			}
		}
	}

	/*
	 * Displys animals in array using Iterator without exposing the animal type
	 */
	public void printAnimals(Iterator iterator) {
		System.out.println("inside print animals using iterator");
		while (iterator.hasNext()) {
			AnimalANJ animal = (AnimalANJ)iterator.next();
			System.out.print(animal.getAnimalName() + "");
			System.out.println("\n");
		}
	}
	


}
