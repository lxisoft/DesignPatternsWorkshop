package com.anjali.animalgame;

import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.game.GameLauncherANJ;

public class TestClientANJ {

	public static void main(String[] args) {
		
		GameLauncherANJ game=new GameLauncherANJ();
		ForestANJ forest=game.setGameANJ();
		game.startGame(forest.getAnimals());
		
	}

}
