package com.pengchun.observer;

/**
 * @Author 彭淳
 * @Date 2021/5/24
 * 观察者
 */
public interface Observer {
    /**
     * 通用修改
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp,float humidity,float pressure);
}
