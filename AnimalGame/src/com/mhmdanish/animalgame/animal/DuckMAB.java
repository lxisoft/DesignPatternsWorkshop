package com.mhmdanish.animalgame.animal;

import com.mhmdanish.animalgame.strategy.EatBehaviorMAB;
import com.mhmdanish.animalgame.strategy.OnlyEatBehavior;

public class DuckMAB {
	
	EatBehaviorMAB eatBehaviorMAB;
	
	public DuckMAB() {
		eatBehaviorMAB = new OnlyEatBehavior();
	}
	public void fly() {
		System.out.println("Flying");
	}
	
	public void eatMAB() {
		eatBehaviorMAB.eatMAB();
	}
	
}
