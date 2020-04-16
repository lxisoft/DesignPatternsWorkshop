package com.jishnu.animalgame.util.decorators;

import com.jishnu.animalgame.model.AnimalJI;

public class WebAnimalJIDecorator extends AnimalJI {
	
	private AnimalJI animal;
	
	public WebAnimalJIDecorator(AnimalJI animal) {
		this.animal = animal;
	}
	
	public void move(int x , int y) {
		this.animal.move(x, y);
	}
	
	public void makeSound() {
		this.animal.makeSound();
	}
	
	public String toString() {
		return this.animal.getClass().getSimpleName() + "[" + this.animal.getX() + "," + this.animal.getY() + "]";
	}


}
