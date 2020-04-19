package com.akhil.animalgame;
import com.akhil.animalgame.forest.*;

/**
 * @author Akhil
 * 
 * command pattern
 * singleton pattern
 * factory pattern
 * abstract factory pattern
 * Iterator pattern
 * adapter pattern
 * Behaviour pattern
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
	  forest.eatAkJ();
	  forest.fight();
	 
 }
 
}
