package com.sruthy.animalgame.webbasedanimal;

import com.sruthy.animalgame.factory.WebBasedAnimal;

/**
 * @author sruthi
 * 
 * Implemented  Factory Pattern
 *
 */
public class Dog extends WebBasedAnimal {

	public String toString()
	{
	      return getClass().getSimpleName();
	}

}
