package com.designpatterns.behavioral.Observer.NotifyMe.Observable;

import com.designpatterns.behavioral.Observer.NotifyMe.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    public int stockCount = 0;
    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+=newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
