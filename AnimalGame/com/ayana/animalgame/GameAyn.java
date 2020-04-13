package com.ayana.animalgame;

public class GameAyn {

	
private static GameAyn instance = new GameAyn();
	
	private GameAyn(){
		
	}

	public static GameAyn getSingleObject()
	{
		return instance;
	}
	
	public void playGameAyn()
	{
		System.out.println("Game starts in 5..4..3..2..1..0");
	}
}
