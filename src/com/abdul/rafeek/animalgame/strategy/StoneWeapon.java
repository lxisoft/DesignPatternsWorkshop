package com.abdul.rafeek.animalgame.strategy;

import com.abdul.rafeek.animalgame.factory.WeaponFactory;

public class StoneWeapon implements WeaponBehaviour {
	WeaponFactory weaponFactory;
	public StoneWeapon(WeaponFactory weaponFactory){
		 this.weaponFactory =weaponFactory;
	}
public	void setWeapon() {
	weaponFactory.createStone();
}
	

}
