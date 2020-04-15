package com.abdul.rafeek.animalgame.animal;
import com.abdul.rafeek.animalgame.strategy.*;
import com.abdul.rafeek.animalgame.factory.WeaponFactory;

public class LionARK extends AnimalARK {
	WeaponFactory weaponFactory;
	public LionARK(WeaponFactory weaponFactory) {
	this.weaponFactory = weaponFactory;
	weaponBehaviour= new StoneWeapon(weaponFactory);
	}

	
}
