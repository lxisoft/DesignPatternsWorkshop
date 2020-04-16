package com.jishnu.animalgame.util.factory;

import com.jishnu.animalgame.model.AnimalJI;


public interface AnimalFactory {
	
	public AnimalJI getType(AnimalType type);
}
