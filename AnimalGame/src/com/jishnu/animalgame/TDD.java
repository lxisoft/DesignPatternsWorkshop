package com.jishnu.animalgame;

import java.io.IOException;

import com.jishnu.animalgame.config.ApplicationConfig;
import com.jishnu.animalgame.controller.GameController;
import com.jishnu.animalgame.model.ForestJI;
import com.jishnu.animalgame.util.factory.AnimalFactory;
import com.jishnu.animalgame.util.factory.AnimalFactoryCreator;
import com.jishnu.animalgame.util.factory.ViewFactory;
import com.jishnu.animalgame.view.ViewInterface;

public class TDD {

	public static void main(String[] args) {
		try {

			System.out.println("-------------->Starting animal game.....");

			ApplicationConfig applicationConfig = ApplicationConfig.getInstance();
			applicationConfig.loadConfig();

			AnimalFactory factory = AnimalFactoryCreator.getFactory(applicationConfig.getPlatform());

			ViewInterface<ForestJI> view = ViewFactory.getView(applicationConfig.getPlatform());

			GameController gc = new GameController(factory);
			gc.intialize();
			gc.startGame();
			gc.setView(view);

			// gc.getForestObservable()
			// .subscribe(()->{
			// 		System.out.println("Forest Updated");
			// });

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
