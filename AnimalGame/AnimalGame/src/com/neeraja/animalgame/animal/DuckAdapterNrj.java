package com.neeraja.animalgame.animal;

public class DuckAdapterNrj extends AnimalNrj {

	DuckNrj duck;
	
	public DuckAdapterNrj(DuckNrj duck) {
		this.duck = duck;
	}
	
	public void walk() {
		this.duck.fly();
	}
}
