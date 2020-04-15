package com.neeraja.animalgame.animal;

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
