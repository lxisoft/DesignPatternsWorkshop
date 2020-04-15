package com.jishnu.animalgame.view;

import com.jishnu.animalgame.model.ForestJI;

public class MobileView implements ViewInterface<ForestJI> {

	@Override
	public void update(ForestJI d) {
		System.out.println("Using Mobile View");
		d.getAnimals().forEach(animal->System.out.println(animal));
		
	}


}
