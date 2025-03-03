package com.designpatterns.behavioral.Observer.WeatherApp;

import com.designpatterns.behavioral.Observer.WeatherApp.observable.WeatherStation;
import com.designpatterns.behavioral.Observer.WeatherApp.observer.Observer;
import com.designpatterns.behavioral.Observer.WeatherApp.observer.PhoneDisplay;
import com.designpatterns.behavioral.Observer.WeatherApp.observer.TVDisplay;

public class WeatherApp {
    public static void main(String []args){
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
    }
}
