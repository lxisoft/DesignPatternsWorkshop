package com.sanjana.AnimalGame;

import com.sanjana.AnimalGame.Animal.*;
import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.Decorator.*;
import com.sanjana.AnimalGame.Forest.ForestSPM;
/**
 * @author sanjana p
 *
 */
public class Tdd{
	public static void main(String [] args){
		ForestSPM forest = ForestSPM.getInstance();
	    forest.createAnimalSPM();
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
				
	}
}