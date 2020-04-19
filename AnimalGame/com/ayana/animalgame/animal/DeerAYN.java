package com.ayana.animalgame.animal;

public class DeerAYN implements AnimalAYN{

	@Override
	public String nameAYN() {
		// TODO Auto-generated method stub
		
		return "Deer";
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return 46-initialSpeed;
	}

	@Override
	public void doActionAYN(StateAYN state) {
		// TODO Auto-generated method stub
		System.out.print("The deer is in walking state : ");
		state.setStateAYN(this);
	}
	
	public String toString()
	{
		return "Walking state";
	}

	@Override
	public void colorAYN() {
		// TODO Auto-generated method stub
		System.out.print(" color : brown\n");
		
	}

	@Override
	public int strengthAYN() {
		// TODO Auto-generated method stub
		return 35;
	}

	@Override
	public int locationXAYN() {
		// TODO Auto-generated method stub
		int locationX=(int)(Math.random()*50);
		return locationX;
	}

	@Override
	public int locationYAYN() {
		// TODO Auto-generated method stub
		int locationY=(int)(Math.random()*50);
		return locationY;
	}

}
