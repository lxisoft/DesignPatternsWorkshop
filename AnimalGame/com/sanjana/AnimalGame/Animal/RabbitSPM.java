package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public class RabbitSPM extends AnimalSPM{
	public RabbitSPM(){
		eatBehaviour = new EatGrassSPM();
	}
	public String featureSPM() {
		return "Rabbit is small";
	}
	}