package com.neeraja.animalgame.animal;

public class TigerNrj extends AnimalNrj {
	
	
	public String getName() {
		return "tiger";
	}
	
	public TigerNrj(){
		System.out.println(">>>>>>>>>>>inside tigerNrj");
		eatBehaviourNrj = new CarnivourousNrj();
	}

	
	
}
