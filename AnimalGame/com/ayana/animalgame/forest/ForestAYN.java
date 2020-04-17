package com.ayana.animalgame.forest;

import java.io.IOException;
import java.util.ArrayList;

import com.ayana.animalgame.animal.AbstractFactoryAYN;
import com.ayana.animalgame.animal.AnimalAYN;

import com.ayana.animalgame.animal.AnimalFactoryProducerAYN;
import com.ayana.animalgame.animal.StateAYN;
import com.ayana.animalgame.animal.StrategyAYN;
import com.ayana.animalgame.configuration.AnimalConfigAYN;


public class ForestAYN {
	
	AnimalFactoryProducerAYN factoryProducer = new AnimalFactoryProducerAYN();
	ArrayList<AnimalAYN> animals=new ArrayList<AnimalAYN>();
	AnimalAYN animal1;
	AnimalAYN animal2;
	AnimalAYN animal3;
	AnimalAYN animal4;
	StrategyAYN strategy;
	public void getAnimalsAYN() throws IOException
	{
		
		AnimalConfigAYN animalConfig = new AnimalConfigAYN();
		String choice = animalConfig.getPropValuesAYN();
		
	    
		 switch(choice)
		  {
			 case "iot":createIotBasedAnimalAYN();
			 
			 break;
			 case "mobile":getMobileBasedAnimalAYN();
			 break;
			 case "web":getWebBasedAnimalAYN();
			 break;
			 default:System.out.println("Invalid...!!!");
		
		  }
	}
	
	public void createIotBasedAnimalAYN()
	{
		 AbstractFactoryAYN abstractFactory = factoryProducer.getFactoryAYN("iot");
		 animal1=abstractFactory.getAnimalAYN("Tiger");
		 animals.add(animal1);
		 
		 animal2=abstractFactory.getAnimalAYN("Lion");
		 animals.add(animal2);
		 
		 animal3=abstractFactory.getAnimalAYN("Deer");
		 animals.add(animal3);
		 
		 animal4=abstractFactory.getAnimalAYN("Rabbit");
		 animals.add(animal4);
		 
		 getIotBasedAnimalAYN();
		 getSpeedOfAnimal();
		 getStateOfAnimal();
		 
	}
	
	public void getSpeedOfAnimal()
	{
		strategy = new StrategyAYN(animal1);
		 System.out.println("speed of tiger : "+strategy.executeStrategyAYN(0));
		 strategy = new StrategyAYN(animal2);
		 System.out.println("speed of lion : "+strategy.executeStrategyAYN(0));
		 strategy = new StrategyAYN(animal3);
		 System.out.println("speed of deer : "+strategy.executeStrategyAYN(0));
		 strategy = new StrategyAYN(animal4);
		 System.out.println("speed of rabbit : "+strategy.executeStrategyAYN(0));


	}
	
	public void getStateOfAnimal()
	{
		StateAYN state = new StateAYN();
		animal1.doActionAYN(state);
		System.out.print(state.getStateAYN().toString()+"\n");
		
		animal2.doActionAYN(state);
		System.out.print(state.getStateAYN().toString()+"\n");
		
		animal3.doActionAYN(state);
		System.out.print(state.getStateAYN().toString()+"\n");
		
		animal4.doActionAYN(state);
		System.out.print(state.getStateAYN().toString()+"\n");
	}
	
	public void getIotBasedAnimalAYN()
	{
		System.out.println("Iot based");
		for(int i=0;i<animals.size();i++)
		{
			animals.get(i).nameAYN();
		}
	}
	
	public void getMobileBasedAnimalAYN()
	{
		AbstractFactoryAYN abstractFactory1 = factoryProducer.getFactoryAYN("mobile");
		 AnimalAYN animal1=abstractFactory1.getAnimalAYN("Tiger");
		 System.out.print("Mobile based");
		 animal1.nameAYN();
		 AnimalAYN animal2=abstractFactory1.getAnimalAYN("Lion");
		 System.out.print("Mobile based");
		 animal2.nameAYN();
		 AnimalAYN animal3=abstractFactory1.getAnimalAYN("Deer");
		 System.out.print("Mobile based");
		 animal3.nameAYN();
		 AnimalAYN animal4=abstractFactory1.getAnimalAYN("Rabbit");
		 System.out.print("Mobile based");
		 animal4.nameAYN();
	}
	
	public void getWebBasedAnimalAYN()
	{
		AbstractFactoryAYN abstractFactory1 = factoryProducer.getFactoryAYN("web");
		 AnimalAYN animal1=abstractFactory1.getAnimalAYN("Tiger");
		 System.out.print("web based");
		 animal1.nameAYN();
		 AnimalAYN animal2=abstractFactory1.getAnimalAYN("Lion");
		 System.out.print("web based");
		 animal2.nameAYN();
		 AnimalAYN animal3=abstractFactory1.getAnimalAYN("Deer");
		 System.out.print("web based");
		 animal3.nameAYN();
		 AnimalAYN animal4=abstractFactory1.getAnimalAYN("Rabbit");
		 System.out.print("web based");
		 animal4.nameAYN();
	}
}
