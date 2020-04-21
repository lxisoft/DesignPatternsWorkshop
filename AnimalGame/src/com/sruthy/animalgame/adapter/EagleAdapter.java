package com.sruthy.animalgame.adapter;

import com.sruthy.animalgame.factory.IOTAnimal;
import com.sruthy.animalgame.iotanimal.Cheetah;
import com.sruthy.animalgame.webbasedanimal.Eagle;


/**
 * @author sruthi
 * 
 * Implemented Adapter Pattern
 *
 */
public class EagleAdapter extends IOTAnimal{

	Eagle eagleSKC;
	
	public EagleAdapter(Eagle eagleSKC) {
		this.eagleSKC = eagleSKC;
	}
	
	public void eat() {
		System.out.println("Eat with peak");
	}

}
