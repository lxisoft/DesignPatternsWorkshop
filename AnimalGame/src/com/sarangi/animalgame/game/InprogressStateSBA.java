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

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class InprogressStateSBA implements StateSBA{
	
	GameSBA gameSBA;
	
	/**
	 * @param gameSBA
	 */
	public InprogressStateSBA(GameSBA gameSBA) {
		super();
		this.gameSBA = gameSBA;
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#startAnimalGameSBA()
	 */
	@Override
	public void startAnimalGameSBA() {
		System.out.println("\n\tThe competition is currently underway. So you can't start the competition again");
		
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#playGameSBA()
	 */
	@Override
	public void playGameSBA() {
		
		System.out.println("\n\t-----------------------------ANIMAL GAME STARTING...----------------------------");
		
		List<AnimalSBA> indianAnimalsSBA = gameSBA.getIndianAnimalsSBA();
		List<AnimalSBA> americanAnimalsSBA = gameSBA.getAmericanAnimalsSBA();
		
		List<AnimalSBA> selectedAnimalsSBA = new ArrayList<AnimalSBA>();
		List<AnimalSBA> winnerAnimalsSBA = new ArrayList<AnimalSBA>();
		
		int rvalue = (int)(Math.random() * indianAnimalsSBA.size());
		AnimalSBA indianAnimal = indianAnimalsSBA.get(rvalue);
		selectedAnimalsSBA.add(indianAnimal);
		
		int randvalue = (int)(Math.random() * americanAnimalsSBA.size());
		AnimalSBA americanAnimal = americanAnimalsSBA.get(randvalue);
		selectedAnimalsSBA.add(americanAnimal);
		
		System.out.println("\n\t IndianCompetitor ->"+indianAnimal+"\n\t Animalname ->"+indianAnimal.getName());
		System.out.println("\n\t AmericanCompetitor ->"+americanAnimal+"\n\t Animalname ->"+americanAnimal.getName());
		
		System.out.println("\n\t\t "+indianAnimal+"- Fight With -"+americanAnimal);
		AnimalSBA winner = selectedAnimalsSBA.get((int)(Math.random() * selectedAnimalsSBA.size()));
		winnerAnimalsSBA.add(winner);
		gameSBA.setWinnerAnimalSBA(winner);
		
		//selectedAnimalsSBA.clear();
		
		//System.out.println("*******************************"+selectedAnimalsSBA);
		
		//gameSBA.setState(gameSBA.getDoneStateSBA());  
		
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#publishingWinnerSBA()
	 */
	@Override
	public void publishingWinnerSBA() {
		System.out.println("\n\tThe competition is currently underway. The winner can only be declared at the end of the competition.");
		
	}
	

}
