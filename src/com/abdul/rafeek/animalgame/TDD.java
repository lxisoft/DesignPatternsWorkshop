package com.abdul.rafeek.animalgame;

import com.abdul.rafeek.animalgame.factory.*;
import com.abdul.rafeek.animalgame.animal.*;
public class TDD {

	public static void main(String[] args) {
		
		System.out.println("<----War Between Animals and Aliens---------->");
		
		System.out.println("<----you are entering to Level 0---------->");
		AnimalGame level0 = new Level0();
		System.out.println("<----you can create a army with animals ---------->");
		/*System.out.println("<----choose animals and its number");
		
		System.out.println("1.Lion");
		System.out.println("2.Fox");
		System.out.println("3.Tiger");*/
		
		//user Create 3-Lions ,4-Tiger, 2-Foxs
		//AbstractFactory used for weaponCreation 
		//Strategy used for weaponInHands();
		level0.Start("Lion",3);
		level0.Start("Tiger",4);
		level0.Start("Fox",2);

	}

	
	
	
}
