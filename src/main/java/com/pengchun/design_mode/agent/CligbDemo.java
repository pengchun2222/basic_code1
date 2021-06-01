package com.pengchun.design_mode.agent;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author 彭淳
 * @Date 2021/4/7
 */
public class CligbDemo {
    public static void main(String[] args) {
        RealSubject target = new RealSubject();
        RealSubject proxy = (RealSubject) Enhancer.create(target.getClass(),
                new MethodInterceptorImpl());
        proxy.sayHello();
    }
}
