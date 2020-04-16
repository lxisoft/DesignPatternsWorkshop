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

}
