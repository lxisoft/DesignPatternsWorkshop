package com.ayana.animalgame.animal;

public class BearAYN implements AnimalAYN,HerbivoresAYN{

	AdapterAYN adapter;
	
	@Override
	public void eat(String type) {
		// TODO Auto-generated method stub
		if(type.equals("grass"))
		{
			System.out.println("eat "+type);
		}
		
		else{
			adapter = new AdapterAYN(type);
			adapter.eat(type);
		}
		
	}

	@Override
	public void nameAYN() {
		// TODO Auto-generated method stub
		System.out.print(" Bear\n");
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

}
