package com.jishnu.animalgame;

import java.io.IOException;

import com.jishnu.animalgame.config.ApplicationConfig;
import com.jishnu.animalgame.controller.GameController;
import com.jishnu.animalgame.model.ForestJI;
import com.jishnu.animalgame.util.behaviors.Observable;
import com.jishnu.animalgame.util.factory.AnimalFactory;
import com.jishnu.animalgame.util.factory.AnimalFactoryCreator;
import com.jishnu.animalgame.util.factory.AnimalFactoryType;
import com.jishnu.animalgame.util.factory.AnimalType;

public class TDD {

  public static void main(String[] args) {
	 try {
		
		System.out.println("Starting animal game.....");
		ApplicationConfig applicationConfig = ApplicationConfig.getInstance();
		applicationConfig.loadConfig();
		
		GameController gc = new GameController();
		gc.intialize();;
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	  
  }

}
