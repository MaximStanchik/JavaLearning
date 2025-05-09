package org.Stanhick;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    };

    public void registerObserver(Observer o) {
        observers.add(o);
    };

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        };
    };

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer  = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        };
    };

    public void measurementsChanged() {
        notifyObservers();
    };

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    };
};
