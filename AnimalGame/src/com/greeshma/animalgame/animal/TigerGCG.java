package com.greeshma.animalgame.animal;

import com.greeshma.animalgame.strategy.EatBehaviourGCG;
import com.greeshma.animalgame.strategy.EatMeatGCG;

public class TigerGCG extends AnimalGCG{
	EatBehaviourGCG eat=new EatMeatGCG();
	public void eatGCG() {
		eat.eat();
	}
}
