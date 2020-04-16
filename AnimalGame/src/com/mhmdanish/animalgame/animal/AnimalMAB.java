package com.mhmdanish.animalgame.animal;

import com.mhmdanish.animalgame.strategy.EatBehaviorMAB;
import com.mhmdanish.animalgame.strategy.HuntAndEatBehaviorMAB;
import com.mhmdanish.animalgame.strategy.OnlyWalkBehaviorMAB;
import com.mhmdanish.animalgame.strategy.WalkBehaviorMAB;

/**
 * 
 * @author mohammed anish
 * 
 * template method pattern
 *
 */
public abstract class AnimalMAB {
	
	WalkBehaviorMAB walkBehaviorMAB;
	EatBehaviorMAB eatBehaviorMAB;
	
	public AnimalMAB() {
		walkBehaviorMAB = new OnlyWalkBehaviorMAB();
		eatBehaviorMAB = new HuntAndEatBehaviorMAB();
	}
	
	public void eatMAB() {
		eatBehaviorMAB.eatMAB();
	}

	public void walkMAB() {
		walkBehaviorMAB.walkMAB();
	}
}
