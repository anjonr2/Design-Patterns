package com.designpatterns.behavioral.Observer.WeatherApp.observer;

public class TVDisplay implements Observer{
    String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
        display();
    }
    void display(){
        System.out.println("TV Display weather updated: "+weather);
    }
}
