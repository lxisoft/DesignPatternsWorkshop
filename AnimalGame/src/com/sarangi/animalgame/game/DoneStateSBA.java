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

/**
 * TODO Provide a detailed description here
 * @author Owner
 * ,
 */
public class DoneStateSBA implements StateSBA{
	
	GameSBA gameSBA;

	/**
	 * @param gameSBA
	 */
	public DoneStateSBA(GameSBA gameSBA) {
		super();
		this.gameSBA = gameSBA;
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#startAnimalGameSBA()
	 */
	@Override
	public void startAnimalGameSBA() {
		System.out.println("\n\tThe winner of the competition is now being announcing.So you can't start the competition again");
		
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#playGameSBA()
	 */
	@Override
	public void playGameSBA() {
		System.out.println("\n\tThe winner of the competition is now being announcing.So you can't start the competition again");
	}

	/* (non-Javadoc)
	 * @see com.sarangi.animalgame.game.StateSBA#publishingWinnerSBA()
	 */
	@Override
	public void publishingWinnerSBA() {
		
		System.out.println("\n\t------------------------The Winner is -> "+gameSBA.getWinnerAnimalSBA()+" Name is ->"+gameSBA.getWinnerAnimalSBA().getName()+"---------------------------------");
		
		//gameSBA.setState(gameSBA.getTodoStateSBA());  
		
	}
	
	

}
