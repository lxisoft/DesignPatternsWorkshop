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
import com.sarangi.animalgame.forest.AmericanForestSBA;
import com.sarangi.animalgame.forest.ForestSBA;
import com.sarangi.animalgame.forest.IndianForestSBA;
import com.sarangi.animalgame.stage.CarpetSpreadingSBA;
import com.sarangi.animalgame.stage.FencingSBA;
import com.sarangi.animalgame.stage.GameStageSBA;
import com.sarangi.animalgame.stage.StageOneSBA;

import com.sarangi.animalgame.zoo.ZooAdapterSBA;
import com.sarangi.animalgame.zoo.ZooSBA;

/**
 * displays Zoo animals using AbstractFactory and Factory method design patterns.
 * displays Forest animals using Adapter design petterns.
 * @author Owner
 * ,
 */
public class GameSBA {
	
	private volatile static GameSBA uniqueInstanceSBA;
	
	private StateSBA TodoStateSBA ;
	private StateSBA InprogressStateSBA ;
	private StateSBA DoneStateSBA ;
	
	StateSBA state = TodoStateSBA;	
	
	private List<AnimalSBA> indianAnimalsSBA = new ArrayList<AnimalSBA>();
	private List<AnimalSBA> americanAnimalsSBA = new ArrayList<AnimalSBA>();
	private AnimalSBA winnerAnimalSBA;
		
	private GameSBA(){}
	
	public static GameSBA getInstanceSBA(){
		
		if (uniqueInstanceSBA == null){
			synchronized (GameSBA.class) {
				if(uniqueInstanceSBA == null){
					uniqueInstanceSBA = new GameSBA();
				}
				
			}			
		}
	 return uniqueInstanceSBA; 	
		
	}
	
			
	public void setupStageSBA()
	{
		GameStageSBA stageOne = new StageOneSBA();
		System.out.println("\n\t***************************** GAME POLICIES **************************************");
		
		stageOne = new CarpetSpreadingSBA(stageOne);
		stageOne = new FencingSBA(stageOne);
		stageOne = new FencingSBA(stageOne);
		System.out.println("\n\t\t"+stageOne.getDescription());		
		
	}
	
	
	
	public AnimalSBA getWinnerAnimalSBA() {
		return winnerAnimalSBA;
	}

	public void setWinnerAnimalSBA(AnimalSBA winnerAnimalSBA) {
		this.winnerAnimalSBA = winnerAnimalSBA;
	}

	public List<AnimalSBA> getIndianAnimalsSBA() {
		return indianAnimalsSBA;
	}

	public void setIndianAnimalsSBA(List<AnimalSBA> indianAnimalsSBA) {
		this.indianAnimalsSBA = indianAnimalsSBA;
	}

	public List<AnimalSBA> getAmericanAnimalsSBA() {
		return americanAnimalsSBA;
	}

	public void setAmericanAnimalsSBA(List<AnimalSBA> americanAnimalsSBA) {
		this.americanAnimalsSBA = americanAnimalsSBA;
	}

	public void startAnimalGameSBA()
	{
		state.startAnimalGameSBA();
		
	}
	
	public void playGameSBA()
	{
		state.playGameSBA();
	}
	
	public void publishingWinnerSBA()
	{
		state.publishingWinnerSBA();
	}
		
	public StateSBA getTodoStateSBA() {
		return TodoStateSBA;
	}

	public void setTodoStateSBA(StateSBA todoStateSBA) {
		TodoStateSBA = todoStateSBA;
	}

	public StateSBA getInprogressStateSBA() {
		return InprogressStateSBA;
	}

	public void setInprogressStateSBA(StateSBA inprogressStateSBA) {
		InprogressStateSBA = inprogressStateSBA;
	}

	public StateSBA getDoneStateSBA() {
		return DoneStateSBA;
	}

	public void setDoneStateSBA(StateSBA doneStateSBA) {
		DoneStateSBA = doneStateSBA;
	}

	public StateSBA getState() {
		return state;
	}

	public void setState(StateSBA state) {
		this.state = state;
	}

	public void startForestAnimalGameSBA()
	{
		
	     List<AnimalSBA> animals = new ArrayList<AnimalSBA>();
	
		 ForestSBA americanForest = new AmericanForestSBA();  
		 ForestSBA indianForest = new IndianForestSBA();
		 
		 ZooSBA zooAdapter1 = new ZooAdapterSBA(indianForest);
		 ZooSBA zooAdapter2 = new ZooAdapterSBA(americanForest);
	     
		 animals = zooAdapter1.bringAnimalSBA("Machali","Asiatic");
		     System.out.println("\n\t************************** INDIAN FOREST ANIMAL ************************************");
		     zooAdapter1.displayAnimalsSBA(animals);
	         
		 animals = zooAdapter2.bringAnimalSBA("Bruce","PantheraAtrox");
		     System.out.println("\n\t************************* AMERICAN FOREST ANIMAL ***********************************");
		     zooAdapter1.displayAnimalsSBA(animals);
		
	}
	
	

}
