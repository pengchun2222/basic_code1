package com.pengchun.observer;

/**
 * @Author 彭淳
 * @Date 2021/5/24
 * 主题
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 唤醒观察者
     */
    public void notifyObserver();
}
