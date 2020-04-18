package com.ayana.animalgame.animal;

public class RabbitAYN implements AnimalAYN{

	@Override
	public String nameAYN() {
		// TODO Auto-generated method stub
		
		return "Rabbit";
		
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return 40+initialSpeed;
	}

	@Override
	public void doActionAYN(StateAYN state) {
		// TODO Auto-generated method stub
		System.out.print("The rabbit is in sitting state : ");
		state.setStateAYN(this);
	}
	
	public String toString()
	{
		return "Sitting state";
	}

	@Override
	public void colorAYN() {
		// TODO Auto-generated method stub
		System.out.print(" color : white\n");
	}

}
