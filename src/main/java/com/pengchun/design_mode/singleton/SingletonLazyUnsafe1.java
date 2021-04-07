package com.pengchun.design_mode.singleton;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 懒汉式解决效率问题升级版（线程不安全）
 */
public class SingletonLazyUnsafe1 {
    public static SingletonLazyUnsafe1 singletonLazyUnsafe1 = null;
    public SingletonLazyUnsafe1 getInstance() {
        if(singletonLazyUnsafe1 == null) {
            synchronized (this) {
                singletonLazyUnsafe1 = new SingletonLazyUnsafe1();
            }
        }
        return singletonLazyUnsafe1;
    }
}
