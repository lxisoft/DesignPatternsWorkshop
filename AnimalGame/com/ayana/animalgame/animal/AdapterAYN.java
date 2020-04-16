package com.ayana.animalgame.animal;

public class AdapterAYN implements HerbivoresAYN{
	
	CarnivoresAYN carnivores;
	
	public AdapterAYN(String type)
	{
		if(type.equals("meat"))
		{
			carnivores = new TigerAYN();
		}
	}

	@Override
	public void eat(String type) {
		// TODO Auto-generated method stub
		
		if(type.equals("meat"))
		{
			carnivores.eat();
		}
		
	}

}
