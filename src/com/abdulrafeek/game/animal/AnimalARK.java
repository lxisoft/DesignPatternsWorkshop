/**
 * 
 */
package com.abdulrafeek.game.animal;
import com.abdulrafeek.game.feature.*;
/**
 * @author rafeek
 *
 */
public abstract class AnimalARK {
	FightBehaviour fightBehaviour;
	
private String name;

public void performFight(){
	fightBehaviour.fight();
}

@Override
public String toString() {
	return String.format("AnimalARK [name=%s]", name);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
