package com.pengchun.observer;

/**
 * @Author 彭淳
 * @Date 2021/5/24
 * 当前观察者
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition: temperature: " + temperature + " humidity:" + humidity + " pressure:" + pressure);
    }
}
