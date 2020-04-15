package com.jishnu.animalgame.model;

import com.jishnu.animalgame.util.stratergy.sound.SoundStratergy;

public abstract class AnimalJI {

	private int x;
	private int y;
	protected SoundStratergy soundStratergy;

	public AnimalJI(){}

	public AnimalJI(int x , int y) {
		this.setX(x);
		this.setY(y);
	}

	public void makeSound() {
		this.soundStratergy.sound();
	}

	public void move(int x , int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + this.getX() + "," + this.getY() + "]";
	}
}
