package com.neeraja.animalgame.animal;

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
}
