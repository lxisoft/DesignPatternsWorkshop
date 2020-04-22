package com.sanjana.AnimalGame;

import com.sanjana.AnimalGame.Adapter.BirdSPM;
import com.sanjana.AnimalGame.Adapter.DuckSPM;
import com.sanjana.AnimalGame.Adapter.PegionSPM;
import com.sanjana.AnimalGame.Animal.*;
import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.Decorator.*;
import com.sanjana.AnimalGame.Forest.ForestSPM;
import com.sanjana.AnimalGame.command.GoLeftSPM;
import com.sanjana.AnimalGame.command.MovementSPM;
import com.sanjana.AnimalGame.command.RemoteControlSPM;
/**
 * @author sanjana p
 *
 */
public class Tdd{

	public static void main(String [] args){
		ForestSPM forest = ForestSPM.getInstance();
	    forest.createAnimalSPM();
	    forest.fight();
	    
		AnimalSPM tiger = new WildTigerSPM();
		tiger.setEat();
		AnimalSPM lion = new WildLionSPM();
		lion.setEat();
		AnimalSPM rabbit = new WildRabbitSPM();
		rabbit.setEat();
		AnimalSPM deer = new WildDeerSPM();
		deer.setEat();
//		System.out.println("******************");
//		AngryDeerSPM andeer = new AngryDeerSPM(deer);
//				andeer.strengthSPM();
		
		BirdSPM target = new DuckSPM(new PegionSPM());
		target.cry();
		System.out.println("3333333333333333333333");
		 RemoteControlSPM remote = new RemoteControlSPM();       
		 MovementSPM move = new MovementSPM();       
		 GoLeftSPM goleft = new GoLeftSPM(move);
		 
	        remote.setCommandSPM(goleft);      
	        remote.buttonPress(); 
		}
}