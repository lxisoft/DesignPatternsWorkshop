package com.ayana.animalgame;

import java.io.IOException;

import com.ayana.animalgame.forest.ForestAYN;

public class GameAyn {

	
private static GameAyn instance = new GameAyn();
	
	private GameAyn(){
		
	}

	public static GameAyn getSingleObject()
	{
		return instance;
	}
	
	public void playGameAyn() throws IOException
	{
		ForestAYN forest =new ForestAYN();
		System.out.println("Game starts in 5..4..3..2..1..0");
		forest.getAnimalsAYN();
	}
}
