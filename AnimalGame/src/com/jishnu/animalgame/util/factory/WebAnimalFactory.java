package com.jishnu.animalgame.util.factory;

import com.jishnu.animalgame.model.AnimalJI;
import com.jishnu.animalgame.model.LionJI;
import com.jishnu.animalgame.model.RabbitJI;
import com.jishnu.animalgame.util.decorators.WebAnimalJIDecorator;

public class WebAnimalFactory implements AnimalFactory {

	@Override
	public AnimalJI getType(AnimalType type) {
		AnimalJI animal = null;
		switch (type) {

		case LION:
			animal = new WebAnimalJIDecorator(new LionJI());
			break;
		case RABBIT:
			animal = new WebAnimalJIDecorator(new RabbitJI());
			break;
		}
		return animal;
	}

}
