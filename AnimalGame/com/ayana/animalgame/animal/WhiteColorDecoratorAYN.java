package com.ayana.animalgame.animal;

public class WhiteColorDecoratorAYN extends ColorDecoratorAYN{

	public WhiteColorDecoratorAYN(AnimalAYN decoratedColor) {
		super(decoratedColor);
		// TODO Auto-generated constructor stub
	}
	
	public void colorAYN()
	{
		decoratedColor.colorAYN();
		setColor(decoratedColor);
	}
	
	public void setColor(AnimalAYN decoratedColor)
	{
		System.out.println("After changing color : white with black stripes\n");
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

}
