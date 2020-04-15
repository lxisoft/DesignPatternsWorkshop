package com.sarath.animalgame;

import com.sarath.animalgame.forest.ForestSKS;
/**
 * @author SarathKumar S
 
 *
 */
public class Tdd {
	public static void main(String[] args) {
		  ForestSKS forest = ForestSKS.getInstance();
		  System.out.println("\n Welcome To The  "  +    forest     + "   Forest");
		  System.out.println("================================="+"\n");
		  
		  forest.createAnimal();
		  //forest.eatSKS();
	 }

}
