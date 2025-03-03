package com.designpatterns.behavioral.Observer.WeatherApp.observable;

import com.designpatterns.behavioral.Observer.WeatherApp.observer.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifySubscribers();
}
