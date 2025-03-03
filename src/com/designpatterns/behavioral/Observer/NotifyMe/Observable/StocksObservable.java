package com.designpatterns.behavioral.Observer.NotifyMe.Observable;

import com.designpatterns.behavioral.Observer.NotifyMe.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
