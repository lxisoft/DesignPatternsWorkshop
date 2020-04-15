package com.jishnu.animalgame.util.behaviors;

import java.util.ArrayList;
import java.util.List;

public class Observable<D> implements AbstractObservable<D>{

	private List<AbstractObserver<D>> observers = new ArrayList<AbstractObserver<D>>();
	
	private D data;
	
	@Override
	public void notifySubscribers() {
		this.observers.forEach(observer->{
			observer.update(data);
		});
	}

	@Override
	public void subscribe(AbstractObserver<D> observer) {
		if(!this.observers.contains(observer)) {
			this.observers.add(observer);
			observer.update(this.data);
		}
	}

	@Override
	public void setData(D d) {
		this.data = d;
		this.notifySubscribers();
	}
	
	

}
