package com.sruthy.animalgame.adapter;

import com.sruthy.animalgame.factory.IOTAnimal;
import com.sruthy.animalgame.iotanimal.Monkey;


/**
 * @author sruthi
 * 
 * Implemented Adapter Pattern
 *
 */
public class MonkeyAdapter extends IOTAnimal{

	Monkey monkeySKC;

	public MonkeyAdapter(Monkey monkeySKC){
		
		this.monkeySKC = monkeySKC;
	}
	
	public void eat() {
		this.monkeySKC.pluck();
	}
}
