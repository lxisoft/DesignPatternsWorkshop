package com.abdul.rafeek.animalgame.animal;

import com.abdul.rafeek.animalgame.factory.WeaponFactory;
import com.abdul.rafeek.animalgame.strategy.RopeWeapon;

public  class FoxARK extends AnimalARK {
	WeaponFactory weaponFactory;
	public FoxARK(WeaponFactory weaponFactory) {
	this.weaponFactory = weaponFactory;
	weaponBehaviour= new RopeWeapon(weaponFactory );
	}


}
