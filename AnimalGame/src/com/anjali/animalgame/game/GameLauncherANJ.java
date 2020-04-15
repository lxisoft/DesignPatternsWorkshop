package com.anjali.animalgame.game;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.BearANJ;
import com.anjali.animalgame.animal.DeerANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.animal.RabbitANJ;
import com.anjali.animalgame.animal.TigerANJ;
import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.strategy.impl.GrazeFood;
import com.anjali.animalgame.strategy.impl.HuntFood;

public class GameLauncherANJ {
	
	ForestANJ forest;
	
	public ForestANJ setGameANJ() {
		
		forest=ForestANJ.getInstance();   //Singleton pattern
		
		forest.getAnimals()[0]=new TigerANJ();
		forest.getAnimals()[0].setAnimalName("Tiger 1");
		
		forest.getAnimals()[1]=new RabbitANJ();
		forest.getAnimals()[1].setAnimalName("Rabbit 1");
		
		forest.getAnimals()[2]=new DeerANJ();
		forest.getAnimals()[2].setAnimalName("Deer 1");
		
		forest.getAnimals()[3]=new DeerANJ();
		forest.getAnimals()[3].setAnimalName("Deer 2");
		
		forest.getAnimals()[4]=new TigerANJ();
		forest.getAnimals()[4].setAnimalName("Tiger 2");
		
		forest.getAnimals()[5]=new BearANJ();
		forest.getAnimals()[5].setAnimalName("Bear 1");
		
		forest.getAnimals()[6]=new LionANJ();
		forest.getAnimals()[6].setAnimalName("Lion 1");
		
		forest.getAnimals()[7]=new DeerANJ();
		forest.getAnimals()[7].setAnimalName("Deer 3");
		
		forest.getAnimals()[8]=new RabbitANJ();
		forest.getAnimals()[8].setAnimalName("Rabbit 2");
		
		forest.getAnimals()[9]=new DeerANJ();
		forest.getAnimals()[9].setAnimalName("Deer 4");
		
		System.out.println("Forest and animals created");
		
		return forest;
			
	}

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
