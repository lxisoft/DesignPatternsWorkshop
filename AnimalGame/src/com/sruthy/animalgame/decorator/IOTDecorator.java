package com.sruthy.animalgame.decorator;

import com.sruthy.animalgame.factory.IOTAnimal;


/**
 * @author sruthi
 * 
 * Implemented Decorator Pattern
 */

public class IOTDecorator extends IOTAnimal{

		IOTAnimal animal;

		public IOTDecorator(IOTAnimal animal) {
			this.animal = animal;
		}
		
		
	}

