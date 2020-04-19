package com.sanjana.AnimalGame.Adapter;

public class DuckSPM implements BirdSPM{
PegionSPM adaptee;

public DuckSPM(PegionSPM a) {
	this.adaptee = a;
}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
	this.adaptee.specificCry();
	}

}
