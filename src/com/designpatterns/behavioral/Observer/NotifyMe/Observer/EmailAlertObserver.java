package com.designpatterns.behavioral.Observer.NotifyMe.Observer;

import com.designpatterns.behavioral.Observer.NotifyMe.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserver(String emailId,StocksObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMail(emailId,"product is back in stock");
    }

    private void sendMail(String emailId,String msg){
        System.out.println("mail sent to: "+emailId);
    }
}
