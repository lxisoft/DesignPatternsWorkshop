package com.ayana.animalgame.forest;

import java.io.IOException;
import java.util.Scanner;

import com.ayana.animalgame.animal.AbstractFactoryAYN;
import com.ayana.animalgame.animal.AnimalAYN;

import com.ayana.animalgame.animal.AnimalFactoryProducerAYN;
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
		 System.out.print("iot based");
		 animal1.nameAYN();
		 AnimalAYN animal2=abstractFactory.getAnimalAYN("Lion");
		 System.out.print("iot based");
		 animal2.nameAYN();
		 AnimalAYN animal3=abstractFactory.getAnimalAYN("Deer");
		 System.out.print("iot based");
		 animal3.nameAYN();
		 AnimalAYN animal4=abstractFactory.getAnimalAYN("Rabbit");
		 System.out.print("iot based");
		 animal4.nameAYN();
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
