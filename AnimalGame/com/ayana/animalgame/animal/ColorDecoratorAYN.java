package com.ayana.animalgame.animal;

public class ColorDecoratorAYN extends AnimalDecoratorAYN{

	public ColorDecoratorAYN(AnimalAYN decoratedAnimal) {
		super(decoratedAnimal);
		// TODO Auto-generated constructor stub
	}
	
	public void colorAYN()
	{
		//decoratedAnimal.colorAYN();
		setColor(decoratedAnimal);
	}
	
	private void setColor(AnimalAYN decoratedAnimal)
	{
		System.out.println("color : grayish brown");
	}

	@Override
	public void nameAYN() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int speedAYN(int initialSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doAction(StateContextAYN context) {
		// TODO Auto-generated method stub
		
	}

}
