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

}
