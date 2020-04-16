package com.jishnu.animalgame.controller;

import java.util.ArrayList;
import java.util.List;

import com.jishnu.animalgame.model.AnimalJI;
import com.jishnu.animalgame.model.ForestJI;
import com.jishnu.animalgame.util.behaviors.Observable;
import com.jishnu.animalgame.util.factory.AnimalFactory;
import com.jishnu.animalgame.util.factory.AnimalType;
import com.jishnu.animalgame.view.ViewInterface;

public class GameController {

	private Observable<ForestJI> forestObservable = new Observable<ForestJI>();

	private ForestJI forest = new ForestJI();

	private ViewInterface<ForestJI> view;

	private AnimalFactory factory;

	public GameController(AnimalFactory factory){
		this.factory = factory;
	}

	public void intialize() {
		this.forestObservable.setData(forest);
		this.addAnimals();
	}

	public void startGame() {
		
	}

	public void addAnimals() {
		List<AnimalJI> animals = new ArrayList<AnimalJI>();
		animals.add(this.factory.getType(AnimalType.LION));
		animals.add(this.factory.getType(AnimalType.RABBIT));
		this.forest.setAnimals(animals);
		this.forestObservable.setData(this.forest);
	}
	
	public void removeAnimal(AnimalJI animal) {}

	public Observable<ForestJI> getForestObservable(){
		return this.forestObservable;
	}

	public void setView(ViewInterface<ForestJI> view) {
		this.view = view;
		this.forestObservable.subscribe(view);
	}

	public void setAnimalFactory(AnimalFactory factory) {
		this.factory = factory;
	}

}
