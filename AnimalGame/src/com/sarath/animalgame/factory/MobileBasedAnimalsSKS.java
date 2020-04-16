package com.sarath.animalgame.factory;

import com.sarath.animalgame.animal.AnimalSKS;
import com.sarath.animalgame.animal.LionSKS;
import com.sarath.animalgame.animal.RabbitSKS;
import com.sarath.animalgame.animal.TigerSKS;

/**
 * @author SarathKumar S
 
 *
 */
public class MobileBasedAnimalsSKS extends AnimalFactorySKS {

	public AnimalSKS getAnimal(String type) {
		
		if (type.equals("tiger")) {
			return new TigerSKS();
		} else if (type.equals("lion")) {
			return new LionSKS();
		} else if (type.equals("rabbit")) {
			return new RabbitSKS();
		}
		return null;
	}
}