package com.abdulrafeek.game.animal;


import com.abdulrafeek.game.feature.FightWithWeapons;

public  class FoxARK extends AnimalARK {
	/*WeaponFactory weaponFactory;
	public FoxARK(WeaponFactory weaponFactory) {
	this.weaponFactory = weaponFactory;
	weaponBehaviour= new RopeWeapon(weaponFactory );
	}*/

	public FoxARK() {
		
		fightBehaviour= new FightWithWeapons();
		}
	

}
