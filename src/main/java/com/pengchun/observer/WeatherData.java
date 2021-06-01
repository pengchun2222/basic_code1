package com.pengchun.observer;

import java.util.ArrayList;

/**
 * @Author 彭淳
 * @Date 2021/5/23
 * 天气数据
 */
public class WeatherData implements Subject{

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temp,float humidity,float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private float temperature; // 温度
    private float humidity;    // 湿度
    private float pressure;    // 压力
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }


}
