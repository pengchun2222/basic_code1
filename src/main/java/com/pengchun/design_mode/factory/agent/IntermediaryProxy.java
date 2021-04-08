package com.pengchun.design_mode.factory.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class IntermediaryProxy implements InvocationHandler {
    private Object obj;

    public IntermediaryProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(this.obj, args);
        return invoke;
    }
}
