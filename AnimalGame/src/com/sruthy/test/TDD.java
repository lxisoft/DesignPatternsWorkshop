/**
 * 
 */
package com.sruthy.test;

import java.util.Scanner;

import com.sruthy.animalgame.Forest;

/**
 * @author sruthi
 *
 */
public class TDD {

	public static void main(String[] args) {

		Forest forestSKC = Forest.getInstance();

		System.out.println("Welcome to the game at" + forestSKC.toString());

		System.out.println("We can know about the animal behaviours");

		knowAnimalBehaviours(forestSKC);

		
	}

	
	
	public static void knowAnimalBehaviours(Forest forestSKC) {
		Scanner s = new Scanner(System.in);
		System.out.println("\n animal details\n-----------------");
		System.out.println("1. whitetiger " + "2. bengaltiger\n");
		int a = s.nextInt();
		switch (a) {
		case 1:
			forestSKC.knowWhiteTigerBehaviour();
			break;

		case 2:
			forestSKC.knowBengalTigerBehaviour();
			break;
		}

	}

}
