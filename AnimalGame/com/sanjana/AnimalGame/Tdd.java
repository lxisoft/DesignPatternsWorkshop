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
	    forest.viewDetailsSPM();
		AnimalSPM tiger = new TigerSPM();
		tiger.setEat();
		
	}
}