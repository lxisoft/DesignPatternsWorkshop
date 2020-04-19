package com.ayana.animalgame.animal;

public class GreyishBrownColorDecoratorAYN extends ColorDecoratorAYN{

	public GreyishBrownColorDecoratorAYN(AnimalAYN decoratedColor)
	{
		super(decoratedColor);
	}
	
	public void colorAYN()
	{
		decoratedColor.colorAYN();
		setColor(decoratedColor);
	}
	
	public void setColor(AnimalAYN decoratedColor)
	{
		System.out.println("After changing color : greyish brown\n");
	}

	@Override
	public String nameAYN() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doActionAYN(StateAYN state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int strengthAYN() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int locationXAYN() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int locationYAYN() {
		// TODO Auto-generated method stub
		return 0;
	}
}
