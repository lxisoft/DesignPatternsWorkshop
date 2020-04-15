package com.sanjana.AnimalGame;

import com.sanjana.AnimalGame.Animal.*;
import com.sanjana.AnimalGame.Behaviour.*;
import com.sanjana.AnimalGame.Forest.ForestSPM;
/**
 * @author sanjana p
 *
 */
public class Tdd{
	public static void main(String [] args){
		ForestSPM forest = ForestSPM.getInstance();
	    forest.createAnimalSPM();
//		AnimalSPM tiger = new TigerSPM();
//		tiger.setEat();
//		AnimalSPM lion = new LionSPM();
//		lion.setEat();
//		AnimalSPM rabbit = new RabbitSPM();
//		rabbit.setEat();
//		AnimalSPM deer = new DeerSPM();
//		deer.setEat();
		
	}
}