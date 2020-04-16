package com.anjali.animalgame;

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
		game.startGame(forest.getAnimals());
		System.out.println("Game over!");

		/*
		 * Testing Adapter pattern
		 */
		System.out.println("Adapter pattern implemented");
		
		PersianLeopardANJ persian=new PersianLeopardANJ();
		persian.climbTree();
		
		BlackJaguarANJ blackJaguar=new BlackJaguarANJ();
		blackJaguar.climbTreeSlow();
		
		/*
		*jaguaradapter 
		*/
		ILeopardANJ leopard=new JaguarAdapterANJ(blackJaguar);			
		leopard.climbTree();
		
	}

}
