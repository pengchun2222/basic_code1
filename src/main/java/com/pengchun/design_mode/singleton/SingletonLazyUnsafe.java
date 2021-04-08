package com.pengchun.design_mode.singleton;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 懒汉式（线程不不安全）
 */
public class SingletonLazyUnsafe {
    public static SingletonHungerUnsafe singletonHungerUnsafe = null;
    public SingletonHungerUnsafe getInstance() {
        if(singletonHungerUnsafe == null) {
            singletonHungerUnsafe =  new SingletonHungerUnsafe();
        }
        return singletonHungerUnsafe;
    }
}
