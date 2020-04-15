package com.anjali.animalgame.game;

import java.util.Scanner;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.BearANJ;
import com.anjali.animalgame.animal.DeerANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.animal.RabbitANJ;
import com.anjali.animalgame.animal.TigerANJ;
import com.anjali.animalgame.factory.creator.AnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.CarnivoreAnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.HerbivoreAnimalCreatorANJ;
import com.anjali.animalgame.factory.creator.OmnivoreAnimalCreatorANJ;
import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.strategy.impl.GrazeFood;
import com.anjali.animalgame.strategy.impl.HuntFood;

public class GameLauncherANJ {
	
	ForestANJ forest;
	
	public ForestANJ setGameANJ() {
		
		forest=ForestANJ.getInstance();   //Singleton pattern
		
		//this.createAnimals();
		Scanner sc=new Scanner(System.in);
		
			/*invoked factory creator for creating animals: factory pattern
			*
			*/
		AnimalCreatorANJ herbivoreCreator=new HerbivoreAnimalCreatorANJ();  
		AnimalCreatorANJ carnivoreCreator=new CarnivoreAnimalCreatorANJ();
		AnimalCreatorANJ omnivoreCreator=new OmnivoreAnimalCreatorANJ();
		
		AnimalANJ createdAnimal1=herbivoreCreator.getAnimalANJ("DeerANJ"); 
		forest.getAnimals()[0]=createdAnimal1;
		forest.getAnimals()[0].setAnimalName("Deer 1");
		
		AnimalANJ createdAnimal2=herbivoreCreator.getAnimalANJ("DeerANJ"); 
		forest.getAnimals()[1]=createdAnimal2;
		forest.getAnimals()[1].setAnimalName("Deer 2");
		
		AnimalANJ createdAnimal3=herbivoreCreator.getAnimalANJ("DeerANJ"); 
		forest.getAnimals()[2]=createdAnimal3;
		forest.getAnimals()[2].setAnimalName("Deer 3");
		
		AnimalANJ createdAnimal4=herbivoreCreator.getAnimalANJ("DeerANJ"); 
		forest.getAnimals()[3]=createdAnimal4;
		forest.getAnimals()[3].setAnimalName("Deer 4");
		
		AnimalANJ createdAnimal5=carnivoreCreator.getAnimalANJ("LionANJ"); 
		forest.getAnimals()[4]=createdAnimal5;
		forest.getAnimals()[4].setAnimalName("Lion 1");
		
		AnimalANJ createdAnimal6=carnivoreCreator.getAnimalANJ("TigerANJ"); 
		forest.getAnimals()[5]=createdAnimal6;
		forest.getAnimals()[5].setAnimalName("Tiger 1");
		
		AnimalANJ createdAnimal7=carnivoreCreator.getAnimalANJ("TigerANJ"); 
		forest.getAnimals()[6]=createdAnimal7;
		forest.getAnimals()[6].setAnimalName("Tiger 2");
		
		AnimalANJ createdAnimal8=omnivoreCreator.getAnimalANJ("BearANJ"); 
		forest.getAnimals()[7]=createdAnimal8;
		forest.getAnimals()[7].setAnimalName("Bear 1");
		
		AnimalANJ createdAnimal9=herbivoreCreator.getAnimalANJ("RabbitANJ"); 
		forest.getAnimals()[8]=createdAnimal9;
		forest.getAnimals()[8].setAnimalName("Rabbit 1");
		
		AnimalANJ createdAnimal10=herbivoreCreator.getAnimalANJ("RabbitANJ"); 
		forest.getAnimals()[9]=createdAnimal10;
		forest.getAnimals()[9].setAnimalName("Rabbit 1");
		
		System.out.println("Forest and animals created"); 
		
		return forest;
			
	}

	/*public void createAnimals() {
																	//invoked factory creator for creating animals: factory pattern
		Scanner sc=new Scanner(System.in);
		//String animalType=sc.nextLine();
		
		AnimalCreatorANJ herbCreator=new HerbivoreAnimalCreatorANJ();
		AnimalCreatorANJ carnivoreCreator=new CarnivoreAnimalCreatorANJ();
		
		AnimalANJ createdAnimal=herbCreator.getAnimalANJ("DeerANJ"); //invoked factory creator for creating animals: factory pattern
		System.out.println(createdAnimal);
		
	}
	*/
	public void startGame(AnimalANJ[] animals) {
		
		int noOfAnimals=10;
		
		do{		
			int firstAnimal=(int)(Math.random()*10);
			int secondAnimal=(int)(Math.random()*10);
			
			if((animals[firstAnimal].isAlive()==true)&&(animals[secondAnimal].isAlive()==true)&&(firstAnimal!=secondAnimal))
			{
				System.out.println(animals[firstAnimal].getAnimalName()+" meets"+animals[secondAnimal].getAnimalName());
				animals[firstAnimal].meetAnotherAnimalANJ(animals[secondAnimal]);
				System.out.println("\n");
			
				if((animals[firstAnimal].isAlive()==false)||(animals[secondAnimal].isAlive()==false)){
					noOfAnimals--;
				}
			}
			}while(noOfAnimals>1);//end of dowhile
			
		if(noOfAnimals==1){
			AnimalANJ winner=animalsLeft();	
		}
		
		} //end of playGame()
		

	public AnimalANJ animalsLeft(){
		AnimalANJ winner=null;
		for(int j=0;j<10;j++){
			if(forest.getAnimals()[j].isAlive()==true){
				System.out.println(forest.getAnimals()[j].getAnimalName()+" left in the forest");
				
				winner=forest.getAnimals()[j];
			}
		}
		return winner;
	}//end of animalsLeft()
	
}
