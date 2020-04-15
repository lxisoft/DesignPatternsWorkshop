package com.jishnu.animalgame.controller;

import com.jishnu.animalgame.config.ApplicationConfig;
import com.jishnu.animalgame.model.ForestJI;
import com.jishnu.animalgame.model.LionJI;
import com.jishnu.animalgame.model.RabbitJI;
import com.jishnu.animalgame.util.behaviors.Observable;
import com.jishnu.animalgame.util.factory.ViewFactory;
import com.jishnu.animalgame.view.ViewInterface;

public class GameController {
	
	private ViewInterface<ForestJI> view;
	
	private Observable<ForestJI> forestObservable = new Observable<ForestJI>();
	
	private ForestJI forest = new ForestJI();
	
	public GameController(){}
	
	public void intialize() {
		this.view = ViewFactory.getView(ApplicationConfig.getInstance().getPlatform());
		this.forestObservable.setData(forest);
		this.forestObservable.subscribe(view);
		this.addAnimals();	
	}
	
	public void startGame() {
		
	}
	
	public void addAnimals() {

	}

}
