package com.abdul.rafeek.animalgame.factory;
import com.abdul.rafeek.animalgame.animal.*;
import com.abdul.rafeek.animalgame.weapon.*;
/*
 * implementing AbstractFactory pattern
 * */
public interface WeaponFactory {
 
	
	
	public Stone createStone();
	 
	public Stick createStick();
	public Rope createRope() ;
	
	
	 
	 
	 
 
 
}
