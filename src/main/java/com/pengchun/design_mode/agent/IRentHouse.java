package com.pengchun.design_mode.agent;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public interface IRentHouse {

    void rentHouse();
}
