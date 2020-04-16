package com.neeraja.animalgame.animal;

import com.neeraja.animalgame.animal.behavior.CarnivourousNrj;

public class EagleNrj extends AnimalNrj{
	
	public String getName() {
		return "eagle";
	}
	
	public EagleNrj(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>inside eagleNrj");
		eatBehaviourNrj = new CarnivourousNrj();
	}


	public void fly() {
		System.out.println("Flying");
	}

	@Override
	public void fight() {
		System.out.println("eagle fighting");
		
	}

	@Override
	public void rest() {
		System.out.println("eagle takes rest");
		
	}

}
