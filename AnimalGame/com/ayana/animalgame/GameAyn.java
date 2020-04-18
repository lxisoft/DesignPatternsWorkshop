package com.ayana.animalgame;

import java.io.IOException;

import com.ayana.animalgame.forest.ForestAYN;

public abstract class GameAyn {
	
	public abstract void startPlayAYN();
	public abstract void createForestAYN()throws IOException;
	
	//template method
	public final void playAYN(){
		startPlayAYN();
	}
}
