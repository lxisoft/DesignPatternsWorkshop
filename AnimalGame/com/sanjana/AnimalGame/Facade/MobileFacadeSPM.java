package com.sanjana.AnimalGame.Facade;

import com.sanjana.AnimalGame.Animal.AnimalSPM;
import com.sanjana.AnimalGame.Factory.MobilebasedFactorySPM;

public class MobileFacadeSPM {
		MobilebasedFactorySPM animal;
		
		public MobileFacadeSPM(MobilebasedFactorySPM animal) {
			this.animal=animal;
		}
		
		public void tigerStrengthSPM()
		{
			System.out.println("Strength of tiger : "+animal.getAnimalSPM("tiger").strengthSPM());
		}
		
		public void lionStrengthSPM()
		{
			System.out.println("Strength of lion : "+animal.getAnimalSPM("lion").strengthSPM());

		}
		
		public void deerStrengthSPM()
		{
			System.out.println("Strength of deer : "+animal.getAnimalSPM("deer").strengthSPM());

		}
		
		public void rabbitStrengthSPM()
		{
			System.out.println("Strength of rabbit : "+animal.getAnimalSPM("rabbit").strengthSPM());

		}



	}
