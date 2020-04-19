package com.ayana.animalgame.animal;

public class LionAYN implements AnimalAYN{

	@Override
	public String nameAYN() {
		// TODO Auto-generated method stub
		return "Lion";
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return 60-10*initialSpeed;
	}

	@Override
	public void doActionAYN(StateAYN state) {
		// TODO Auto-generated method stub
		System.out.print("The lion is in standing state : ");
		state.setStateAYN(this);
	}

	public String toString()
	{
		return "Standing state";
	}

	@Override
	public void colorAYN() {
		// TODO Auto-generated method stub
		System.out.print(" color : yellow gold\n");
		
	}

	@Override
	public int strengthAYN() {
		// TODO Auto-generated method stub
		return 53;
	}
}
