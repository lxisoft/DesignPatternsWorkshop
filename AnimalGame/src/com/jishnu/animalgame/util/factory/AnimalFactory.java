package com.jishnu.animalgame.util.factory;

import com.jishnu.animalgame.model.AnimalJI;
import com.jishnu.animalgame.model.LionJI;
import com.jishnu.animalgame.model.RabbitJI;

public interface AnimalFactory {
	
	public AnimalJI getType(AnimalType type);
}
