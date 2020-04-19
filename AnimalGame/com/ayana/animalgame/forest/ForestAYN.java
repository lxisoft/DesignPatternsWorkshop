package com.ayana.animalgame.forest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ayana.animalgame.animal.AbstractFactoryAYN;
import com.ayana.animalgame.animal.AnimalAYN;

import com.ayana.animalgame.animal.AnimalFactoryProducerAYN;
import com.ayana.animalgame.animal.FacadeAYN;
import com.ayana.animalgame.animal.GreyishBrownColorDecoratorAYN;
import com.ayana.animalgame.animal.IteratorAYN;
import com.ayana.animalgame.animal.NameRepositoryAYN;
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
			 case "mobile":createMobileBasedAnimalAYN();
			 break;
			 case "web":createWebBasedAnimalAYN();
			 break;
			 default:System.out.println("Invalid...!!!");
		
		  }
	}
	
	public void createIotBasedAnimalAYN()
	{
		 System.out.println("Creating Iot based");
		 AbstractFactoryAYN abstractFactory = factoryProducer.getFactoryAYN("iot");
		 animal1=abstractFactory.getAnimalAYN("Tiger");
		 animals.add(animal1);
		 
		 animal2=abstractFactory.getAnimalAYN("Lion");
		 animals.add(animal2);
		 
		 animal3=abstractFactory.getAnimalAYN("Deer");
		 animals.add(animal3);
		 
		 animal4=abstractFactory.getAnimalAYN("Rabbit");
		 animals.add(animal4);
		 
		 getAnimalAYN();
		 getSpeedOfAnimalAYN();
		 getStrengthOfAnimal();
		 getStateOfAnimalAYN();
		 setColorOfAnimalAYN();	 
	}
	
	public void createMobileBasedAnimalAYN()
	{
		 System.out.println("Creating Mobile based");
		 AbstractFactoryAYN abstractFactory = factoryProducer.getFactoryAYN("mobile");
		 animal1=abstractFactory.getAnimalAYN("Tiger");
		 animals.add(animal1);
		 
		 animal2=abstractFactory.getAnimalAYN("Lion");
		 animals.add(animal2);
		 
		 animal3=abstractFactory.getAnimalAYN("Deer");
		 animals.add(animal3);
		 
		 animal4=abstractFactory.getAnimalAYN("Rabbit");
		 animals.add(animal4);
		 
		 getAnimalAYN();
		 getSpeedOfAnimalAYN();
		 getStrengthOfAnimal();
		 getStateOfAnimalAYN();
		 setColorOfAnimalAYN();	 
	}
	
	public void createWebBasedAnimalAYN()
	{
		 System.out.println("Creating Web based");
		 AbstractFactoryAYN abstractFactory = factoryProducer.getFactoryAYN("web");
		 animal1=abstractFactory.getAnimalAYN("Tiger");
		 animals.add(animal1);
		 
		 animal2=abstractFactory.getAnimalAYN("Lion");
		 animals.add(animal2);
		 
		 animal3=abstractFactory.getAnimalAYN("Deer");
		 animals.add(animal3);
		 
		 animal4=abstractFactory.getAnimalAYN("Rabbit");
		 animals.add(animal4);
		 
		 getAnimalAYN();
		 getSpeedOfAnimalAYN();
		 getStrengthOfAnimal();
		 getStateOfAnimalAYN();
		 setColorOfAnimalAYN();	 
	}
	
	public void getAnimalAYN()
	{
		NameRepositoryAYN nameRepository = new NameRepositoryAYN();
		
		for(IteratorAYN iter =nameRepository .getIterator(); iter.hasNext(animals);){
	        
			AnimalAYN a = (AnimalAYN)iter.next(animals);
			System.out.println(a.nameAYN());
	      } 	
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
	
	public void getStrengthOfAnimal()
	{
		FacadeAYN facadeAYN = new FacadeAYN(animal1,animal2,animal3,animal4);
		facadeAYN.tigerStrength();
		facadeAYN.lionStrength();
		facadeAYN.deerStrength();
		facadeAYN.rabbitStrength();
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
			fightAYN();
		}
		else{
			fightAYN();
		}		
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
	
	public void fightAYN()
	{
		int j,k;
		System.out.println("\nFight...\n");
		for(j=0,k=1;j<6;j++)
		{
			System.out.println("Round "+k+"\n------------\n");

			for(int i=0;i<15;i++)
			{
				int random1=(int)(Math.random()*animals.size());
				int random2=(int)(Math.random()*animals.size());
				int locationX1=animals.get(random1).locationXAYN();
				int locationY1=animals.get(random1).locationYAYN();
				int locationX2=animals.get(random2).locationXAYN();
				int locationY2=animals.get(random2).locationYAYN();
				int d1=Math.abs(locationX1-locationX2);
				int d2=Math.abs(locationY1-locationY2);
				if(animals.get(random1).nameAYN()!=animals.get(random2).nameAYN())
				{
				if(d1<=10 && d2<=10)
			      {
					  
				    System.out.println("Animal="+animals.get(random1).nameAYN()+" Strength="+animals.get(random1).strengthAYN()+" location="+locationX1+","+locationY1);
				    System.out.println("Animal="+animals.get(random2).nameAYN()+" Strength="+animals.get(random2).strengthAYN()+" location="+locationX2+","+locationY2);
					
				    if(animals.get(random1).strengthAYN()==animals.get(random2).strengthAYN())
					{
						System.out.println("Will not fight");
					}
				    
				    else if(animals.get(random1).strengthAYN()>animals.get(random2).strengthAYN())
					{
						System.out.println(animals.get(random1).nameAYN()+" win...\n");
						animals.remove(random2);
					}
					
					else 
					{
					System.out.println(animals.get(random2).nameAYN()+" win...\n");
					animals.remove(random1);
				    }				
			    }
			  }

			}
			k++;
			if(1==animals.size())
			{
				System.out.println("ALIVE ANIMALS\n");
				for(AnimalAYN a:animals)
				{
					System.out.println(a.nameAYN());
				}
				break;
			}
		}
		
	}	
	
}
