package com.pengchun.design_mode.singleton;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 * 懒汉式双重加锁模式（最终版）
 */
public class SingletonLazyUnsafeDoubleCheckLock {
    public static volatile SingletonLazyUnsafeDoubleCheckLock singletonLazyUnsafeDoubleCheckLock = null;
    public SingletonLazyUnsafeDoubleCheckLock getInstance() {
        if(singletonLazyUnsafeDoubleCheckLock == null) {
            synchronized (this) {
                if(singletonLazyUnsafeDoubleCheckLock == null) {
                    singletonLazyUnsafeDoubleCheckLock = new SingletonLazyUnsafeDoubleCheckLock();
                }
            }
        }
        return singletonLazyUnsafeDoubleCheckLock;
    }
}
