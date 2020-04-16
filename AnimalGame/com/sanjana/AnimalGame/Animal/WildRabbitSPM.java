package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class WildRabbitSPM extends AnimalSPM{
	String name;
	
	public WildRabbitSPM(){
		name="rabbit";
		eatBehaviour = new EatGrassSPM();
	}
	public String toString() {
		return name;
	}
	public String featureSPM() {
		return "Rabbit is small";
	}
	
	public int strengthSPM() {
		return (int)(Math.random()*80);
	}
	}