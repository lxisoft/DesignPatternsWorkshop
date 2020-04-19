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

	@Override
	public int strengthAYN() {
		// TODO Auto-generated method stub
		return 30;
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
