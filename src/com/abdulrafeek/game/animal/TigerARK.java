package com.abdulrafeek.game.animal;

import com.abdulrafeek.game.feature.FightWithLegs;

/*import com.abdul.rafeek.animalgame.factory.*;
import com.abdul.rafeek.animalgame.strategy.StickWeapon;*/
public  class TigerARK extends AnimalARK{
	
	
/*	WeaponFactory weaponFactory;
	public TigerARK(WeaponFactory weaponFactory) {
	this.weaponFactory = weaponFactory;
	weaponBehaviour= new StickWeapon(weaponFactory );*/
//	weaponsInHand();
//	}
	
	
	public TigerARK() {
		
		fightBehaviour= new FightWithLegs();
		}
}
