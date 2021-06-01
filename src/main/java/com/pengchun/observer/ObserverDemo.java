package com.pengchun.observer;

/**
 * @Author 彭淳
 * @Date 2021/5/24
 */
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(1,10,30.1f);
        weatherData.setMeasurements(5,1120,33.1f);
        weatherData.setMeasurements(123,140,10.1f);


    }
}
