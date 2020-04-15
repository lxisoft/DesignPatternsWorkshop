package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class TigerSPM extends AnimalSPM{
	public TigerSPM(){
		eatBehaviour = new EatFleshSPM();
	}
	public String featureSPM() {
		return "tiger has strips";
	}
	}
