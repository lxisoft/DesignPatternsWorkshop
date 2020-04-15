package com.mhmdanish.animalgame.factory;

import com.mhmdanish.animalgame.animal.AnimalMAB;

/**
 * @author mohammed anish
 * Abstract factory pattern
 *
 */

public abstract class AbstractAnimalFactoryMAB {

	public abstract AnimalMAB createAnimal(String type);
}
