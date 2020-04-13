package com.akhil.animalgame;
import com.akhil.animalgame.forest.*;

/**
 * @author Akhil
 * 
 *
 */


public class Tdd {
 public static void main(String[] args) {
	  ForestAKJ forest = ForestAKJ.getInstance();
	  System.out.println("=================================================");
	  System.out.println(           "Welcome To The  "  +    forest     + "   Forest");
	  System.out.println("=================================================");
	  
	  forest.createAnimal();
	 
 }
}
