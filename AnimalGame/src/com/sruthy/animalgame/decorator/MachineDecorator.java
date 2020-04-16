package com.sruthy.animalgame.decorator;

import com.sruthy.animalgame.factory.IOTAnimal;

/**
 * @author sruthi
 * 
 * Implemented Decorator Pattern
 */

public class MachineDecorator extends IOTDecorator{

	public MachineDecorator(IOTAnimal animal) {
		super(animal);
	}

	@Override
	public void eat() {
		animal.eat();
		System.out.println("Eat with the help of machines");
		charged();
	}

	public void charged() {
		System.out.println("Get charged after having");
	}
}
