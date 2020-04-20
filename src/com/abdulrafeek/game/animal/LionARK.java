package com.abdulrafeek.game.animal;
import com.abdulrafeek.game.feature.*;
/*
import com.abdul.rafeek.animalgame.factory.WeaponFactory;
*/
public class LionARK extends AnimalARK {
	
	/*WeaponFactory weaponFactory;
	public LionARK(WeaponFactory weaponFactory) {
	this.weaponFactory = weaponFactory;
	weaponBehaviour= new StoneWeaponBehaviour(weaponFactory);
	}*/
	
	public LionARK() {
	
	fightBehaviour= new FightWithLegs();
	}
}
