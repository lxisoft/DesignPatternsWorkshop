package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class LionSPM extends AnimalSPM{
	public LionSPM(){
		eatBehaviour = new EatFleshSPM();
	}
	public String featureSPM() {
		return "lion has sharp teeth";
	}
	}