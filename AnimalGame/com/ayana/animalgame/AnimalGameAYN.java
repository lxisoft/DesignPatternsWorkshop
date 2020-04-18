package com.ayana.animalgame;

import java.io.IOException;

import com.ayana.animalgame.forest.ForestAYN;

public class AnimalGameAYN extends GameAyn{
	

private static AnimalGameAYN instance = new AnimalGameAYN();
	
	private AnimalGameAYN(){
		
	}

	public static GameAyn getSingleObject()
	{
		return instance;
	}
	
	public void startPlayAYN() {
	      System.out.println("Animal Game Started. Enjoy the game!");
	   }
	
	public void createForestAYN() throws IOException
	{
		ForestAYN forest =new ForestAYN();
		forest.getAnimalsAYN();
	}
}
