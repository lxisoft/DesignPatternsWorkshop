/**
 * 
 */
package com.mhmdanish.animalgame.decorator;

import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.strategy.WalkAndFightBehaviorMAB;
import com.mhmdanish.animalgame.strategy.WalkBehaviorMAB;

/**
 * @author mohammed anish
 * 
 * Decorator pattern
 *
 */
public class FightableMAB extends AnimalMAB {
	
	AnimalMAB animal;
	
	WalkBehaviorMAB walkBehaviorMAB;
	
	public FightableMAB(AnimalMAB animal) {
		walkBehaviorMAB = new WalkAndFightBehaviorMAB();
		this.animal = animal;
	}
	
	public void eatMAB() {
		this.animal.eatMAB();
	}
	
	public void walkMAB() {
		walkBehaviorMAB.walkMAB();
	}

}
