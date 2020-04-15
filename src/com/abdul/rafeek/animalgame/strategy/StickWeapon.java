package com.abdul.rafeek.animalgame.strategy;

import com.abdul.rafeek.animalgame.factory.WeaponFactory;

public class StickWeapon implements WeaponBehaviour{
	WeaponFactory weaponFactory;
	public StickWeapon(WeaponFactory weaponFactory){
		 this.weaponFactory =weaponFactory;
		// setWeapon();
	}
public	void setWeapon() {
	weaponFactory.createStick();
}
	

}
