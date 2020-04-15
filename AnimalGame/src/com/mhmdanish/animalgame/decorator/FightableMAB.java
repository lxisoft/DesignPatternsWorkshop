/**
 * 
 */
package com.mhmdanish.animalgame.decorator;

import com.mhmdanish.animalgame.animal.AnimalMAB;

/**
 * @author mohammed anish
 * 
 * Decorator pattern
 *
 */
public class FightableMAB extends AnimalMAB {
	
	AnimalMAB animal;
	
	public FightableMAB(AnimalMAB animal) {
		this.animal = animal;
	}
	
	public void eatMAB() {
		this.animal.eatMAB();
	}

	public void walkMAB() {
		this.animal.walkMAB();
		this.fight();
	}
	
	public void fight() {
		System.out.println("fighting");
	}

}
