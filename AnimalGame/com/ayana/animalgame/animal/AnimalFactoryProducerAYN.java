package com.ayana.animalgame.animal;

public class AnimalFactoryProducerAYN {
	
	public AbstractFactoryAYN getFactoryAYN(String factoryType)
	{
		if(factoryType.equals("iot"))
		{
			return new IotBasedAnimalAYN();
		}
		else if(factoryType.equals("mobile"))
		{
			return new MobileBasedAnimalAYN();
		}
		
		else if(factoryType.equals("web"))
		{
			return new WebBasedAnimalAYN();
		}
		else{
			return null;
		}
	}

}
