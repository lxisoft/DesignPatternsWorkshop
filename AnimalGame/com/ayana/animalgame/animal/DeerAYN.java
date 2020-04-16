package com.ayana.animalgame.animal;

public class DeerAYN implements AnimalAYN{

	@Override
	public void nameAYN() {
		// TODO Auto-generated method stub
		System.out.print(" Deer\n");
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return initialSpeed+40*2;
	}

	@Override
	public void colorAYN() {
		// TODO Auto-generated method stub
		System.out.println("brown\n");
		
	}

	@Override
	public void doAction(StateContextAYN context) {
		// TODO Auto-generated method stub
		
		System.out.println("Deer is in running state");
		context.setState(this);
		
	}
	
	public String toString()
	{
		return "Running state";
	}

}
