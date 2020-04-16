package com.ayana.animalgame.forest;

import java.io.IOException;
import java.util.Scanner;

import com.ayana.animalgame.animal.AbstractFactoryAYN;
import com.ayana.animalgame.animal.AnimalAYN;

import com.ayana.animalgame.animal.AnimalFactoryProducerAYN;
import com.ayana.animalgame.animal.BearAYN;
import com.ayana.animalgame.animal.ColorDecoratorAYN;
import com.ayana.animalgame.animal.ContextAYN;
import com.ayana.animalgame.animal.DeerAYN;
import com.ayana.animalgame.animal.FacadeAYN;
import com.ayana.animalgame.animal.LionAYN;
import com.ayana.animalgame.animal.RabbitAYN;
import com.ayana.animalgame.animal.StateContextAYN;
import com.ayana.animalgame.animal.TigerAYN;
import com.ayana.animalgame.configuration.AnimalConfigAYN;

public class ForestAYN {
	
	AnimalFactoryProducerAYN factoryProducer = new AnimalFactoryProducerAYN();
	
	public void getAnimalsAYN() throws IOException
	{
		
		AnimalConfigAYN animalConfig = new AnimalConfigAYN();
		String choice = animalConfig.getPropValuesAYN();
		
	    
		 switch(choice)
		  {
			 case "iot":getIotBasedAnimalAYN();
			 break;
			 case "mobile":getMobileBasedAnimalAYN();
			 break;
			 case "web":getWebBasedAnimalAYN();
			 break;
			 default:System.out.println("Invalid...!!!");
		
		  }
	}
	
	public void getIotBasedAnimalAYN()
	{
		AbstractFactoryAYN abstractFactory = factoryProducer.getFactoryAYN("iot");
		 AnimalAYN animal1=abstractFactory.getAnimalAYN("Tiger");
		 System.out.println("iot based");
		 animal1.nameAYN();
		 AnimalAYN animal2=abstractFactory.getAnimalAYN("Lion");
		 animal2.nameAYN();
		 AnimalAYN animal3=abstractFactory.getAnimalAYN("Deer");
		 animal3.nameAYN();
		 AnimalAYN animal4=abstractFactory.getAnimalAYN("Rabbit");
		 animal4.nameAYN();
		 getAllAnimalSpeedAYN();
		 
		 System.out.print("deer with color ");
		 animal3.colorAYN();
		 AnimalAYN grey = new ColorDecoratorAYN(new DeerAYN());
		 System.out.print("deer with ");
		 grey.colorAYN();
		 
		 StateContextAYN context = new StateContextAYN();
		 animal3.doAction(context);
		 System.out.println(context.getState().toString());
		 getAllStrengthAYN();
	}
	
	public void getMobileBasedAnimalAYN()
	{
		AbstractFactoryAYN abstractFactory1 = factoryProducer.getFactoryAYN("mobile");
		 AnimalAYN animal1=abstractFactory1.getAnimalAYN("Tiger");
		 System.out.println("Mobile based");
		 animal1.nameAYN();
		 AnimalAYN animal2=abstractFactory1.getAnimalAYN("Lion");
		 animal2.nameAYN();
		 AnimalAYN animal3=abstractFactory1.getAnimalAYN("Deer");
		 animal3.nameAYN();
		 AnimalAYN animal4=abstractFactory1.getAnimalAYN("Rabbit");
		 animal4.nameAYN();
		 AnimalAYN animal5=abstractFactory1.getAnimalAYN("Bear");
		 animal5.nameAYN();
		
		 BearAYN bear = new BearAYN();
		 System.out.print("Bear ");
		 bear.eat("grass");
		 bear.eat("meat");
		 
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
	
	public void getAllAnimalSpeedAYN()
	{
		ContextAYN context = new ContextAYN(new TigerAYN());
		System.out.println("speed of tiger = "+context.executeStrategyAYN(0));
		context = new ContextAYN(new LionAYN());
		System.out.println("speed of lion = "+context.executeStrategyAYN(0));
		context = new ContextAYN(new DeerAYN());
		System.out.println("speed of deer = "+context.executeStrategyAYN(0));
		context = new ContextAYN(new RabbitAYN());
		System.out.println("speed of rabbit = "+context.executeStrategyAYN(0));



	}
	
	public void getAllStrengthAYN()
	{
		FacadeAYN strength = new FacadeAYN();
		strength.getTigerStrengthAYN();
		strength.getLionStrengthAYN();
		strength.getDeerStrengthAYN();
		strength.getRabbitStrengthAYN();
	}
}
