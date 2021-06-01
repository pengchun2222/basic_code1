package com.pengchun.observer;

/**
 * @Author 彭淳
 * @Date 2021/5/24
 * 天气预报观察者
 */
public class ForecastDisplay implements DisplayElement,Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: temperature: " + temperature + " humidity:" + humidity + " pressure:" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
