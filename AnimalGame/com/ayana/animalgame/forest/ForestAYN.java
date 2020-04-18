package com.ayana.animalgame.forest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ayana.animalgame.animal.AbstractFactoryAYN;
import com.ayana.animalgame.animal.AnimalAYN;

import com.ayana.animalgame.animal.AnimalFactoryProducerAYN;
import com.ayana.animalgame.animal.GreyishBrownColorDecoratorAYN;
import com.ayana.animalgame.animal.ReddishBrownColorDecoratorAYN;
import com.ayana.animalgame.animal.StateAYN;
import com.ayana.animalgame.animal.StrategyAYN;
import com.ayana.animalgame.animal.WhiteColorDecoratorAYN;
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
		 getSpeedOfAnimalAYN();
		 getStateOfAnimalAYN();
		 setColorOfAnimalAYN();
		 
	}
	
	public void getSpeedOfAnimalAYN()
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
	
	public void getStateOfAnimalAYN()
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
	
	public void setTigerColorAYN()
	{
		System.out.print("Tiger with normal ");
		animal1.colorAYN();
		AnimalAYN white = new WhiteColorDecoratorAYN(animal1);
		white.colorAYN();
		
	}
	
	public void setLionColorAYN()
	{
		System.out.print("Lion with normal ");
		animal2.colorAYN();
		AnimalAYN reddish = new ReddishBrownColorDecoratorAYN(animal2);
		reddish.colorAYN();

	}
	
	public void setDeerColorAYN()
	{
		System.out.print("Deer with normal ");
		animal3.colorAYN();
		AnimalAYN greyish = new GreyishBrownColorDecoratorAYN(animal3);
		greyish.colorAYN();
		
	}
	
	public void setRabbitColorAYN()
	{
		System.out.print("Rabbit with normal ");
		animal4.colorAYN();
		AnimalAYN greyish1 = new GreyishBrownColorDecoratorAYN(animal4);
		greyish1.colorAYN();
		
	}
	
	public void setColorOfAnimalAYN()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("If you want to change the color of any animal..?(yes=1/no=0)");
		int value=scan.nextInt();
		if(value==1)
		{
			System.out.println("1.Lion\n2.Tiger\n3.Deer\n4.Rabbit\n");
			System.out.print("please select :");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1 :setLionColorAYN();
				break;
			case 2:setTigerColorAYN();
				break;
			case 3:setDeerColorAYN();
				break;
			case 4:setRabbitColorAYN();
				break;
			default:System.out.println("Invalid...!!!");
	
			}

		}
		else{
			System.out.println("working inprogress:)");
		}
		
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
