package com.abdul.rafeek.animalgame.factory;
import com.abdul.rafeek.animalgame.weapon.*;
import com.abdul.rafeek.animalgame.animal.*;
import com.abdul.rafeek.animalgame.weapon.Rope;
import com.abdul.rafeek.animalgame.weapon.Stick;
import com.abdul.rafeek.animalgame.weapon.Stone;
import com.abdul.rafeek.animalgame.alien.*;
public class Level0WeaponFactory implements WeaponFactory{
 
	
	
	@Override
	public Stone createStone() {
		System.out.println("stone weapon inhand is flatStone");
		return new FlatStone();
	}

	@Override
	public Stick createStick() {
		System.out.println("Stick weapon inhand is woodenStick ");
		return new WoodenStick();
	}

	@Override
	public Rope createRope() {
		System.out.println("Stick weapon inhand is green Rope ");
		return new GreenRope();
	}

	
 
}
