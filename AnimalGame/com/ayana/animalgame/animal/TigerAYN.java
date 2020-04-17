package com.ayana.animalgame.animal;

public class TigerAYN implements AnimalAYN{

	@Override
	public void nameAYN() {
		// TODO Auto-generated method stub
		System.out.print(" tiger\n");
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

}
