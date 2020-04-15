package com.abdul.rafeek.animalgame.animal;
import com.abdul.rafeek.animalgame.factory.*;
import com.abdul.rafeek.animalgame.strategy.StickWeapon;
public  class TigerARK extends AnimalARK{
	
	
	WeaponFactory weaponFactory;
	public TigerARK(WeaponFactory weaponFactory) {
	this.weaponFactory = weaponFactory;
	weaponBehaviour= new StickWeapon(weaponFactory );
//	weaponsInHand();
	}
/*void weaponsInHand() {
	 weaponFactory.createStone();
	 weaponFactory.createStick();
}
*/	
	
	

}
