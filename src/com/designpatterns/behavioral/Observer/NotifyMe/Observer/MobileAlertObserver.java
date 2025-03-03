package com.designpatterns.behavioral.Observer.NotifyMe.Observer;

import com.designpatterns.behavioral.Observer.NotifyMe.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserver(String userName,StocksObservable observable){
        this.observable=observable;
        this.userName=userName;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName,"product is back to stock");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("msg sent to "+ userName);
    }
}
