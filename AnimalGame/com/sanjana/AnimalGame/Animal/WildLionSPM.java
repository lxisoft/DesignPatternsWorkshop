package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class WildLionSPM extends AnimalSPM{
	String name;
	
	public WildLionSPM(){
		name="lion";
		eatBehaviour = new EatFleshSPM();
	}
	public String toString() {
		return name;
	}
	public String featureSPM() {
		return "lion has sharp teeth";
	}
	
	public int strengthSPM() {
		return (int)(Math.random()*100);
	}
	}