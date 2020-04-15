package com.abdul.rafeek.animalgame.strategy;

import com.abdul.rafeek.animalgame.factory.WeaponFactory;

public class RopeWeapon implements WeaponBehaviour {
	WeaponFactory weaponFactory;
	public RopeWeapon(WeaponFactory weaponFactory){
		 this.weaponFactory =weaponFactory;
		 //setWeapon();
	}
public	void setWeapon() {
	weaponFactory.createRope();
}
	

}
