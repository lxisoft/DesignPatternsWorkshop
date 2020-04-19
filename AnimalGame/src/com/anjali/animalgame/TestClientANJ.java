package com.anjali.animalgame;

import java.io.IOException;

import com.anjali.animalgame.animal.AnimalANJ;
import com.anjali.animalgame.animal.DeerANJ;
import com.anjali.animalgame.animal.LionANJ;
import com.anjali.animalgame.animal.RabbitANJ;
import com.anjali.animalgame.animal.TigerANJ;
import com.anjali.animalgame.animal.adapter.adaptee.ILeopardANJ;
import com.anjali.animalgame.animal.adapter.adaptee.PersianLeopardANJ;
import com.anjali.animalgame.animal.adapter.adapter.JaguarAdapterANJ;
import com.anjali.animalgame.animal.adapter.target.BlackJaguarANJ;
import com.anjali.animalgame.forest.ForestANJ;
import com.anjali.animalgame.game.AnimalGameANJ;
import com.anjali.animalgame.observer.DangerSubject;

public class TestClientANJ {

	public static void main(String[] args) {
		
		AnimalGameANJ game=new AnimalGameANJ();
		game.playGame();
		
		/*try {
			game.startGame(forest.getAnimals());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Game over!");
		System.out.println("/n");
		
		 * Testing Adapter pattern : jaguaradapter 
		 
		System.out.println("Adapter pattern implemented");

		PersianLeopardANJ persian=new PersianLeopardANJ();
		persian.climbTree();
		
		BlackJaguarANJ blackJaguar=new BlackJaguarANJ();
		blackJaguar.climbTreeSlow();

		ILeopardANJ leopard=new JaguarAdapterANJ(blackJaguar);			
		leopard.climbTree();
		
		System.out.println("/n");
		
		 * Template method pattern testing
		 
		System.out.println("Template pattern implemented");
		
		AnimalANJ lion=new LionANJ();
		lion.setAnimalName("Lion");
		
		DeerANJ deer=new DeerANJ();
		deer.setAnimalName("Deer");
		
		 
		template method is invoked. 
		algorithms are encapsulated in template method
		algorithms are invoked by order 
		
		lion.templateMethod(deer);  
		System.out.println("Thank you!");
		*/
		
	}

}
