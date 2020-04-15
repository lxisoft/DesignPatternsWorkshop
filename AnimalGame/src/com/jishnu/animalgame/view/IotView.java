package com.jishnu.animalgame.view;

import com.jishnu.animalgame.model.ForestJI;

public class IotView implements ViewInterface<ForestJI> {

	@Override
	public void update(ForestJI d) {
		System.out.println("Using IOT View");
		d.getAnimals().forEach(animal->System.out.println(animal));
		
	}



}
