package com.ayana.animalgame.animal;

public class FacadeAYN {
	
	private AnimalAYN tiger;
	private AnimalAYN lion;
	private AnimalAYN deer;
	private AnimalAYN rabbit;
	
	public FacadeAYN(AnimalAYN animal1,AnimalAYN animal2,AnimalAYN animal3,AnimalAYN animal4)
	{
		tiger=animal1;
		lion=animal2;
		deer=animal3;
		rabbit=animal4;
	}
	
	public void tigerStrength()
	{
		System.out.println("Strength of tiger : "+tiger.strengthAYN());
	}
	
	public void lionStrength()
	{
		System.out.println("Strength of lion : "+lion.strengthAYN());

	}
	
	public void deerStrength()
	{
		System.out.println("Strength of deer : "+deer.strengthAYN());

	}
	
	public void rabbitStrength()
	{
		System.out.println("Strength of rabbit : "+rabbit.strengthAYN());

	}



}
