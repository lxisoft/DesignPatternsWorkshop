package com.ayana.animalgame.animal;

public class TigerAYN implements AnimalAYN,CarnivoresAYN{

	@Override
	public void nameAYN() {
		// TODO Auto-generated method stub
		System.out.print(" tiger\n");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat meat");
		
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return initialSpeed+50*2;
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
		System.out.println("strenth of tiger is 55");
		
	}

}
