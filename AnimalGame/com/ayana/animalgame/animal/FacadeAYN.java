package com.ayana.animalgame.animal;

public class FacadeAYN {
	
	private AnimalAYN tiger;
	private AnimalAYN lion;
	private AnimalAYN deer;
	private AnimalAYN rabbit;
	
	public FacadeAYN()
	{
		tiger=new TigerAYN();
		lion=new LionAYN();
		deer= new DeerAYN();
		rabbit=new RabbitAYN();
		
	}
	public void getTigerStrengthAYN()
	{
		tiger.strengthAYN();
	}
	
	public void getLionStrengthAYN()
	{
		lion.strengthAYN();
	}
	
	public void getDeerStrengthAYN()
	{
		deer.strengthAYN();
	}
	
	public void getRabbitStrengthAYN()
	{
		rabbit.strengthAYN();
	}

}
