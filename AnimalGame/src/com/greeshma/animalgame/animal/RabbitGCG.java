package com.greeshma.animalgame.animal;

import com.greeshma.animalgame.strategy.EatBehaviourGCG;
import com.greeshma.animalgame.strategy.EatGrassGCG;

public class RabbitGCG extends AnimalGCG {
	EatBehaviourGCG eat=new EatGrassGCG();
	
	public void eatGCG() {
		eat.eat();
	}
}