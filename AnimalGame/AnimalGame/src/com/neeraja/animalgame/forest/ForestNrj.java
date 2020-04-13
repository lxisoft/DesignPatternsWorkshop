package com.neeraja.animalgame.forest;

import java.util.Scanner;

import com.neeraja.animalgame.animal.AnimalNrj;
import com.neeraja.animalgame.animal.DuckAdapterNrj;
import com.neeraja.animalgame.animal.DuckNrj;
import com.neeraja.animalgame.animal.LionNrj;
import com.neeraja.animalgame.animal.TigerNrj;

public class ForestNrj {
	
	//implementing singleton pattern
private static volatile ForestNrj instance = null;
	
	private ForestNrj() {
		
	}
	
	

	public static ForestNrj getInstanceNrj() {
		if(instance == null) {
			synchronized(ForestNrj.class) {
				if(instance == null) {
					instance = new ForestNrj();
				}
			}
		}
		
		return instance;
	}
	
	  public void animalSound() { 
		  AnimalNrj tiger = new TigerNrj();
		  AnimalNrj lion =new LionNrj();
		  AnimalNrj duck = new DuckAdapterNrj(new DuckNrj());
		  walkingMode(tiger);
		  walkingMode(lion); 
		  walkingMode(duck); 
		  }
	  
	  private void walkingMode(AnimalNrj animal) { 
		  animal.walkNrj(); 
		  }
	 

}
