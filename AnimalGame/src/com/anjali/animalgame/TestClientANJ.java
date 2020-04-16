package com.anjali.animalgame;

import java.io.IOException;

import com.anjali.animalgame.animal.adapter.adaptee.ILeopardANJ;
import com.anjali.animalgame.animal.adapter.adaptee.PersianLeopardANJ;
import com.anjali.animalgame.animal.adapter.adapter.JaguarAdapterANJ;
import com.anjali.animalgame.animal.adapter.target.BlackJaguarANJ;
import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.game.GameLauncherANJ;

public class TestClientANJ {

	public static void main(String[] args) {
		
		GameLauncherANJ game=new GameLauncherANJ();
		ForestANJ forest=game.setGameANJ();
		try {
			game.startGame(forest.getAnimals());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Game over!");
		System.out.println("/n");
		/*
		 * Testing Adapter pattern : jaguaradapter 
		 */
		System.out.println("Adapter pattern implemented");
		
		PersianLeopardANJ persian=new PersianLeopardANJ();
		persian.climbTree();
		
		BlackJaguarANJ blackJaguar=new BlackJaguarANJ();
		blackJaguar.climbTreeSlow();

		ILeopardANJ leopard=new JaguarAdapterANJ(blackJaguar);			
		leopard.climbTree();
		
		
		
	}

}
