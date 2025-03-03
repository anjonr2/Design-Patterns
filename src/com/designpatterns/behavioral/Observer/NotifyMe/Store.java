package com.designpatterns.behavioral.Observer.NotifyMe;

import com.designpatterns.behavioral.Observer.NotifyMe.Observable.IphoneObservableImpl;
import com.designpatterns.behavioral.Observer.NotifyMe.Observable.StocksObservable;
import com.designpatterns.behavioral.Observer.NotifyMe.Observer.EmailAlertObserver;
import com.designpatterns.behavioral.Observer.NotifyMe.Observer.MobileAlertObserver;
import com.designpatterns.behavioral.Observer.NotifyMe.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String []args){
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserver("test@gmail.com",iphoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("xyz@gmail.com",iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockCount(10);
    }
}
