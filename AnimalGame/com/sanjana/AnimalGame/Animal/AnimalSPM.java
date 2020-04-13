package com.sanjana.AnimalGame.Animal;

import com.sanjana.AnimalGame.Behaviour.*;
/**
 * @author sanjana p
 *
 */
public abstract class AnimalSPM{

	// StrengthBehaviour StrengthBehaviour;
	EatBehaviourSPM eatBehaviour;

public void setEat(){

	eatBehaviour.eat();
}

}