package com.pengchun.observer;

/**
 * @Author 彭淳
 * @Date 2021/5/24
 * 统计观察者
 */
public class StatisticsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: temperature: " + temperature + " humidity:" + humidity + " pressure:" + pressure);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
