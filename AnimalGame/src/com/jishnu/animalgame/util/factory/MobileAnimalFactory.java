package com.jishnu.animalgame.util.factory;

import com.jishnu.animalgame.model.AnimalJI;
import com.jishnu.animalgame.model.LionJI;
import com.jishnu.animalgame.model.RabbitJI;
import com.jishnu.animalgame.util.decorators.MobileAnimalJIDecorator;

public class MobileAnimalFactory implements AnimalFactory {

	@Override
	public AnimalJI getType(AnimalType type) {
		AnimalJI animal = null;
		switch (type) {

		case LION:
			animal = new MobileAnimalJIDecorator(new LionJI());
			break;
		case RABBIT:
			animal = new MobileAnimalJIDecorator(new RabbitJI());
			break;
		}
		return animal;
	}

}
