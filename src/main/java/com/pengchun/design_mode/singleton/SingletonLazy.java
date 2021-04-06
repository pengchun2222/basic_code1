package com.pengchun.design_mode.singleton;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 懒汉式线程安全(效率低)
 */
public class SingletonLazy {
    public static SingletonHungerUnsafe singletonHungerUnsafe = null;

    public synchronized SingletonHungerUnsafe getInstance() {

        if (singletonHungerUnsafe == null) {
            singletonHungerUnsafe = new SingletonHungerUnsafe();
        }
        return singletonHungerUnsafe;
    }
}

