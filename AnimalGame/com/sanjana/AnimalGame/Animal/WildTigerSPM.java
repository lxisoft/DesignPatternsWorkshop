package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class WildTigerSPM extends AnimalSPM{
	String name;
	
	public WildTigerSPM(){
		name="tiger";
		eatBehaviour = new EatFleshSPM();
	}
	public String toString() {
		return name;
	}
	public String featureSPM() {
		return "tiger has strips";
	}
	public int strengthSPM() {
		return (int)(Math.random()*200);	
	}
	}
