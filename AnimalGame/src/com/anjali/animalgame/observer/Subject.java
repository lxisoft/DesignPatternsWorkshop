package com.anjali.animalgame.observer;

/*
 * Observer pattern Subject
 */
public interface Subject {

	//methods to register and unregister observers
		public void register(Observer obj);
		public void unregister(Observer obj);
		
		//method to notify observers of change
		public void notifyObservers();
		
		//method to get updates from subject
		public void getUpdate(Boolean b);
		
}
