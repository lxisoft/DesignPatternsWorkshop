package com.abdul.rafeek.animalgame.factory;
import com.abdul.rafeek.animalgame.animal.*;
import com.abdul.rafeek.animalgame.weapon.*;
public  class Level1WeaponFactory implements WeaponFactory {
 
	@Override
	public Stone createStone() {
		// TODO Auto-generated method stub
		return new SharpStone();
	}

	@Override
	public Stick createStick() {
		// TODO Auto-generated method stub
		return new WoodenStick();
	}

	@Override
	public Rope createRope() {
		System.out.println("Stick weapon inhand is green Rope ");
		return new GreenRope();
	}
	
	
 
}
