package com.designpatterns.behavioral.Observer.WeatherApp.observable;

import com.designpatterns.behavioral.Observer.WeatherApp.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observers = new ArrayList<>();
    String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : observers){
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather){
        this.weather=newWeather;
        notifySubscribers();
    }
}
