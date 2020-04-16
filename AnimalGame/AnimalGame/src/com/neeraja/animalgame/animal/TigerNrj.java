package com.neeraja.animalgame.animal;

import com.neeraja.animalgame.animal.behavior.CarnivourousNrj;

public class TigerNrj extends AnimalNrj {
	
	
	public String getName() {
		return "tiger";
	}
	
	public TigerNrj(){
		System.out.println(">>>>>>>>>>>inside tigerNrj");
		eatBehaviourNrj = new CarnivourousNrj();
	}

	
	
}
