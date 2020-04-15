/**
 * 
 */
package com.sruthy.animalgame;

import com.sruthy.animalgame.animal.Animal;
import com.sruthy.animalgame.animal.BengalTiger;
import com.sruthy.animalgame.animal.RunWithAimOfPray;
import com.sruthy.animalgame.animal.RunWithHeadStraight;
import com.sruthy.animalgame.animal.WhiteTiger;

/**
 * @author sruthi
 * 
 * Implemented Singleton Pattern, Strategy Pattern
 *
 */
public class Forest {

	String name;

	Animal whiteTigerSKC;

	Animal benTigerSKC;

	private static Forest forestSKC = new Forest();

	private Forest() {

		name = " Amazon";
		createAnimalsAndBehaviours();
	}

	public static Forest getInstance() {
		return forestSKC;
	}

	public void createAnimalsAndBehaviours() {

		whiteTigerSKC = new WhiteTiger();

		whiteTigerSKC.setRunBehavior(new RunWithHeadStraight());

		benTigerSKC = new BengalTiger();

		benTigerSKC.setRunBehavior(new RunWithAimOfPray());

	}
	
	public void knowWhiteTigerBehaviour() {
		
		whiteTigerSKC.getRunBehavior().run();
	}
	
	public void knowBengalTigerBehaviour() {
		
		benTigerSKC.getRunBehavior().run();
	}

	@Override
	public String toString() {
		return name;
	}

}
