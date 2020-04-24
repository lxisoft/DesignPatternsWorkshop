package com.greeshma.animalgame.factory;

import com.greeshma.animalgame.animal.AnimalGCG;
import com.greeshma.animalgame.animal.LionGCG;
import com.greeshma.animalgame.animal.RabbitGCG;
import com.greeshma.animalgame.animal.TigerGCG;
import com.greeshma.animalgame.decorator.IotGCG;
import com.greeshma.animalgame.decorator.MobileGCG;

public class MobileFactoryGCG implements AbstractAnimalFactoryGCG {
		@Override
		public AnimalGCG createAnimalGCG(String animalType) {
			if(animalType.equals("lion")) {
				return new MobileGCG(new LionGCG());
			} else if(animalType.equals("tiger")) {
				return new MobileGCG(new TigerGCG());
			}else if(animalType.equals("rabbit")) {
				return new MobileGCG(new RabbitGCG()); 
			}
			return null;

		}
}
