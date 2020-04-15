package com.jishnu.animalgame.util.decorators;

import com.jishnu.animalgame.model.AnimalJI;

public class IotAnimalJIDecorator extends AnimalJI {
	
	
	private AnimalJI animal;
	
	public IotAnimalJIDecorator(AnimalJI animal) {
		this.animal = animal;
	}
	
	public void move(int x , int y) {
		this.animal.move(x, y);
	}
	
	public void makeSound() {
		this.animal.makeSound();
	}

}
