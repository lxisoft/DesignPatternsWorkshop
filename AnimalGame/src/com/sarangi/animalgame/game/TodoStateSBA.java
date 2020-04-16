/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sarangi.animalgame.game;

import java.util.ArrayList;
import java.util.List;

import com.sarangi.animalgame.animal.AnimalSBA;
import com.sarangi.animalgame.zoo.AmericanZooSBA;
import com.sarangi.animalgame.zoo.IndianZooSBA;
import com.sarangi.animalgame.zoo.ZooSBA;

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class TodoStateSBA implements StateSBA{
	
	GameSBA gameSBA;
	
	/**
	 * @param gameSBA
	 */
	public TodoStateSBA(GameSBA gameSBA) {
		super();
		this.gameSBA = gameSBA;
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#startAnimalGameSBA()
	 */
	@Override
	public void startAnimalGameSBA() {
		
	    List<AnimalSBA> indianAnimalsSBA = new ArrayList<AnimalSBA>();
	    List<AnimalSBA> americanAnimalsSBA = new ArrayList<AnimalSBA>();
		
		ZooSBA indianZoo = new IndianZooSBA();
		ZooSBA americanZoo = new AmericanZooSBA();
		
		System.out.println("\n\t-----------------------------WELCOME TO ANIMAL GAME----------------------------");
		System.out.println("\n\t\t Introducing Competitors are..........");
				
		indianAnimalsSBA = indianZoo.bringAnimalSBA("Machali","Asiatic");
		System.out.println("\n\t************************** INDIAN ZOO ANIMALS ************************************");
		     indianZoo.displayAnimalsSBA(indianAnimalsSBA);
		
		americanAnimalsSBA = americanZoo.bringAnimalSBA("Bruce","PantheraAtrox");
		System.out.println("\n\t************************* AMERICAN ZOO ANIMALS ***********************************");
		     americanZoo.displayAnimalsSBA(americanAnimalsSBA);
		     
		 gameSBA.setIndianAnimalsSBA(indianAnimalsSBA);
		 gameSBA.setAmericanAnimalsSBA(americanAnimalsSBA);
		     
		 //gameSBA.setState(gameSBA.getInprogressStateSBA());     
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#playGameSBA()
	 */
	@Override
	public void playGameSBA() {
		System.out.println("\n\tThe competition is now in the moment of getting acquainted with the contestants. The competition has not begun");
		
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#publishingWinnerSBA()
	 */
	@Override
	public void publishingWinnerSBA() {
		
		System.out.println("\n\tThe competition is now in the moment of getting acquainted with the contestants. The competition has not begun");
		
	}
	

}
