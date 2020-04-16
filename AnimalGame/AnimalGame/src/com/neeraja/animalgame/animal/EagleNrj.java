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

}
