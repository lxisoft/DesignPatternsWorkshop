package com.ayana.animalgame.animal;

public class RabbitAYN implements AnimalAYN{

	@Override
	public void nameAYN() {
		// TODO Auto-generated method stub
		
		System.out.print(" rabbit\n");
		
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return initialSpeed+38*2;
	}

	@Override
	public void colorAYN() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doAction(StateContextAYN context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void strengthAYN() {
		// TODO Auto-generated method stub
		System.out.println("strength of rabbit is 40");
	}

}
