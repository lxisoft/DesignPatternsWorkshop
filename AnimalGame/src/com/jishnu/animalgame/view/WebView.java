package com.jishnu.animalgame.view;

import com.jishnu.animalgame.model.ForestJI;

public class WebView implements ViewInterface<ForestJI> {

	
	public WebView(){}
	
	@Override
	public void update(ForestJI d) {
		System.out.println("Using Web View");
		d.getAnimals().forEach(animal->System.out.println(animal));
		
	}


}
