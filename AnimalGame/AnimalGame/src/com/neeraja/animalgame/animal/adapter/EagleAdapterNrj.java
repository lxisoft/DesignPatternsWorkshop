package com.neeraja.animalgame.animal.adapter;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.EagleNrj;

public class EagleAdapterNrj extends AnimalNrj {
	
	public String getName() {
		return "eagle";
	}

	EagleNrj eagle;
	
	public EagleAdapterNrj(EagleNrj eagle) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>> inside eagle adapter");
		this.eagle = eagle;
	}
	
	public void walk() {
		this.eagle.fly();
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		
	}
}
