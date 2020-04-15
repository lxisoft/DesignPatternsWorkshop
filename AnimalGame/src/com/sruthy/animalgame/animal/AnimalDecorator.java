package com.sruthy.animalgame.animal;

/**
 * @author sruthi
 * 
 * Implemented  Decorator Pattern
 *
 */

public class AnimalDecorator extends Animal {

	Animal animalSKC;

	public AnimalDecorator(Animal animalSKC) {
		this.animalSKC = animalSKC;
	}
	
	public void eatSKC() {
		this.animalSKC.eatSKC();
	}

	public void walkSKC() {
		this.animalSKC.walkSKC();
		this.hunt();
	}
	
	public void hunt() {
		System.out.println("hunting");
	}
}