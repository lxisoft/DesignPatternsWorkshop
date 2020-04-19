package com.ayana.animalgame.animal;

public class TigerAYN implements AnimalAYN{

	@Override
	public String nameAYN() {
		// TODO Auto-generated method stub
		return "Tiger";
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return initialSpeed+10*5;
	}

	@Override
	public void doActionAYN(StateAYN state) {
		// TODO Auto-generated method stub
		
		System.out.print("The tiger is in running state : ");
		state.setStateAYN(this);
	}
	
	public String toString()
	{
		return "Running state";
	}

	@Override
	public void colorAYN() {
		// TODO Auto-generated method stub
		System.out.print(" color : orange with black stripes\n");
	}

	@Override
	public int strengthAYN() {
		// TODO Auto-generated method stub
		return 50;
	}

}
