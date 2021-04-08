package com.pengchun.design_mode.factory.agent;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class MethodInterceptorImpl implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before say hello...");
        Object returnValue= methodProxy.invokeSuper(obj, args);
        System.out.println("After say hello...");
        return returnValue;
    }

}
