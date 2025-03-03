package com.designpatterns.behavioral.Observer.WeatherApp.observer;

public class PhoneDisplay implements Observer{
    String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
        display();
    }
    private void display(){
        System.out.println("Phone display: weather updated "+weather);
    }
}
