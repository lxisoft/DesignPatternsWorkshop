/**
 * 
 */
package com.abdulrafeek.game.level;
import com.abdulrafeek.game.bird.*;
import java.util.Arrays;
import com.abdulrafeek.game.*;
import com.abdulrafeek.game.adaptor.BirdAdaptor;
import com.abdulrafeek.game.animal.FoxARK;
import com.abdulrafeek.game.animal.LionARK;
import com.abdulrafeek.game.animal.TigerARK;
import com.abdulrafeek.game.animal.AnimalARK;

/**
 * @author rafeek
 * 
 * Concrete creator      
 *
 */
public class Level0Factory extends AnimalGame {

	public AnimalARK createAnimal(String type) {
		AnimalARK animal = null;
		if (type.equals("Lion")) {

			animal = new LionARK();
			animal.setName("zimbaLion");

		} else if (type.equals("Tiger")) {

			animal = new TigerARK();
			animal.setName("sherkhaanTiger");
		} else if (type.equals("Fox")) {

			animal = new FoxARK();
			animal.setName("soothranFox");

		}
		else if (type.equals("WoodPecker")) {

			animal = new BirdAdaptor(new WoodPeckerARK());
			animal.setName("nimoPecker");

		}
		return animal;
	}

}
