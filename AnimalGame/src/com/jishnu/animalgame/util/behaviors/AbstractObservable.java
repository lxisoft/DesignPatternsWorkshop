package com.jishnu.animalgame.util.behaviors;

public interface AbstractObservable<D> {
  public void notifySubscribers();
  public void subscribe(AbstractObserver<D> observer);
  public void setData(D d);
}
