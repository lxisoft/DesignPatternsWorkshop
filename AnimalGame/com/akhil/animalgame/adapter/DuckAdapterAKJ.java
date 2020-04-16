package com.akhil.animalgame.adapter;

import com.akhil.animalgame.animal.AnimalAKJ;

/**
 * @author AKhil johnson
 * Adapter pattern
 *
 */

public class DuckAdapterAKJ extends AnimalAKJ{
	DuckAdapterAKJ duck;

	@Override
	public String eatAKJ() {
		
		return "eate Grasss";
	}
	

	public void walk() {
		
		this.duck.fly();
	}


	private String fly() {
		return "Duck is flying";
		
	}
	
	public DuckAdapterAKJ(DuckAdapterAKJ duck) {
		this.duck = duck;
	}

}
