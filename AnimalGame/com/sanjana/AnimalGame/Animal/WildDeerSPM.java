package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class WildDeerSPM extends AnimalSPM{
	
	String name;
	public WildDeerSPM() {
		name="deer";
		eatBehaviour = new EatGrassSPM();
	}
	public String toString() {
		return name;
	}
	
	
	public String featureSPM() {
		return "deer runs fast";
	}
	
	public int strengthSPM() {
		return (int)(Math.random()*80);
	}
}