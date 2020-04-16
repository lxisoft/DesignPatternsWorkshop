package com.mhmdanish.animalgame.adapter;

import com.mhmdanish.animalgame.animal.AnimalMAB;
import com.mhmdanish.animalgame.animal.DuckMAB;

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
	
	public void eatMAB() {
		this.duck.eatMAB();
	}
	
	public void walk() {
		this.duck.fly();
	}

}
