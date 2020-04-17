package com.sruthy.animalgame.decorator;

import com.sruthy.animalgame.factory.IOTAnimal;

/**
 * @author sruthi
 * 
 * Implemented Decorator Pattern
 */

public class MachineDecorator extends IOTDecorator{

	public MachineDecorator(IOTAnimal animalSKC) {
		super(animalSKC);
	}

	@Override
	public void eat() {
		animalSKC.eat();
		System.out.println("Eat with the help of machines");
		charged();
	}

	public void charged() {
		System.out.println("Get charged after having");
	}
}
