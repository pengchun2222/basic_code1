package com.pengchun.design_mode.singleton;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 单例饿汉式不安全的
 */
public class SingletonHungerUnsafe {
    /**
     * 第一种写法
     */
    public static SingletonHungerUnsafe instance = new SingletonHungerUnsafe();

    public SingletonHungerUnsafe getInstance() {
        return instance;
    }

    /**
     * 第二种写法
     */
    public static SingletonHungerUnsafe instance1 = null;
    static {
        instance1 = new SingletonHungerUnsafe();
    }
    public SingletonHungerUnsafe getInstance1() {
        return instance1;
    }

}
