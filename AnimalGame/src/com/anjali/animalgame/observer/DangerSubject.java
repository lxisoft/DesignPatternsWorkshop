package com.anjali.animalgame.observer;

import java.util.ArrayList;
import java.util.List;

import com.anjali.animalgame.forest.ForestANJ;

/*
 * Observer pattern subject implementer
 */
public class DangerSubject implements Subject{

		private static DangerSubject uniqueInstance;  /**
			 											*Singleton pattern implemented-marked constructor as private
			 											*/											 										 
		private DangerSubject() {} 

		public static DangerSubject getInstance() {
			if(uniqueInstance==null) {
				uniqueInstance=new DangerSubject();
			}
			return uniqueInstance;
		}
	
	private List<Observer> observers = new ArrayList<>();
	
	private Boolean isDanger;
	
	public Boolean getIsDanger() {
		return isDanger;
	}

	public void setIsDanger(Boolean isDanger) {
		this.isDanger = isDanger;
	}

	@Override
	public void register(Observer object) {
		observers.add(object);
	}

	@Override
	public void unregister(Observer object) {
		int i = observers.indexOf(object);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(isDanger);
			}
	}

	@Override
	public void getUpdate(Boolean b) {
		notifyObservers();
	}

}
