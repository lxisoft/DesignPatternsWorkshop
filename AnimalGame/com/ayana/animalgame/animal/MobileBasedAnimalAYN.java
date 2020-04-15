package com.ayana.animalgame.animal;

public class MobileBasedAnimalAYN extends AbstractFactoryAYN{

	@Override
	public AnimalAYN getAnimalAYN(String animalType) {
		// TODO Auto-generated method stub
		if(animalType.equals("Tiger"))
		{
			return new TigerAYN();
		}
		
		else if(animalType.equals("Lion"))
		{
			return new LionAYN();
		}
		
		else if(animalType.equals("Deer"))
		{
			return new DeerAYN();
		}
		
		else if(animalType.equals("Rabbit"))
		{
			return new RabbitAYN();
		}
		
		else
		{
			return null;
		}
	}

}
