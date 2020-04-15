package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class DeerSPM extends AnimalSPM{
	public DeerSPM(){
		eatBehaviour = new EatGrassSPM();
	}
	
	public String featureSPM() {
		return "deer runs fast";
	}
}