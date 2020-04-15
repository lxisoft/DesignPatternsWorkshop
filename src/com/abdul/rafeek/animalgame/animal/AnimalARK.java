package com.abdul.rafeek.animalgame.animal;

import java.util.*;

import com.abdul.rafeek.animalgame.strategy.WeaponBehaviour;
import com.abdul.rafeek.animalgame.weapon.*;

public abstract class AnimalARK {

	private String name;

	private int strength;

	WeaponBehaviour weaponBehaviour;

	public void weaponsInHand() {
		weaponBehaviour.setWeapon();
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
}
