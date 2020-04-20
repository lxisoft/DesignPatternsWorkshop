/**
 * 
 */
package com.abdulrafeek.game.bird;

import com.abdulrafeek.game.feature.FightBehaviour;

/**
 * @author rafeek
 *
 */
public abstract class BirdARK {
	FightBehaviour fightBehaviour;
	private String name;

	public void performFight(){
		fightBehaviour.fight();
	}

	@Override
	public String toString() {
		return String.format("BirdARK [name=%s]", name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
