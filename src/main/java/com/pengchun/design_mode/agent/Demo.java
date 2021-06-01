package com.pengchun.design_mode.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class Demo {
    public static void main(String[] args) {
        IRentHouse rentHouse = new RentHouse();
        //定义一个handler
        InvocationHandler handler = new IntermediaryProxy(rentHouse);
        //获得类的class loader
        ClassLoader cl = rentHouse.getClass().getClassLoader();

        //动态产生一个代理者
        IRentHouse proxy = (IRentHouse) Proxy.newProxyInstance(cl, new Class[]{IRentHouse.class}, handler);
        proxy.rentHouse();

    }
}
