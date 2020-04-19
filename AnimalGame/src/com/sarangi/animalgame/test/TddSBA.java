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
package com.sarangi.animalgame.test;


import com.sarangi.animalgame.game.DoneStateSBA;
import com.sarangi.animalgame.game.GameSBA;
import com.sarangi.animalgame.game.InprogressStateSBA;
import com.sarangi.animalgame.game.StateSBA;
import com.sarangi.animalgame.game.TodoStateSBA;

/**
 * The TddSBA class implements an game using Singleton Dp
 * @author SarangiBalu A
 * ,
 */
public class TddSBA {
	
	public static void main(String[] args) {
				
		GameSBA zooGame = GameSBA.getInstanceSBA();
		
		   zooGame.setupStageLightsSBA();
		
		   zooGame.setupStageSBA();
		   
		   zooGame.showAllZooWithAnimalsInGame();
		   
		   StateSBA todoStateSBA = new TodoStateSBA(zooGame);
		   zooGame.setState(todoStateSBA);		   
		   zooGame.startAnimalGameSBA();
		   
		   StateSBA inprogressStateSBA = new InprogressStateSBA(zooGame);
		   zooGame.setState(inprogressStateSBA);	
		   zooGame.playGameSBA();
		   
		   StateSBA doneStateSBA = new DoneStateSBA(zooGame);
		   zooGame.setState(doneStateSBA);	
		   zooGame.publishingWinnerSBA();
	}

}
