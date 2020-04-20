package com.abdulrafeek.game.adaptor;
import com.abdulrafeek.game.animal.*;
import com.abdulrafeek.game.bird.*;
/*
 * Adaptor Pattern
 */
public class BirdAdaptor extends AnimalARK{
	BirdARK birdARK;
public BirdAdaptor(BirdARK birdARK) {
	this.birdARK= birdARK;
	
}
public void performFight(){
	birdARK.performFight();
}



}
