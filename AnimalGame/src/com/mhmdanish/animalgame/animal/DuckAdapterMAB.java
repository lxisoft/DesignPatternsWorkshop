package com.mhmdanish.animalgame.animal;

/**
 * @author mohammed anish
 * Adapter pattern
 *
 */

public class DuckAdapterMAB extends AnimalMAB {
	
	DuckMAB duck;
	
	public DuckAdapterMAB(DuckMAB duck) {
		this.duck = duck;
	}
	
	public void walk() {
		this.duck.fly();
	}

}
