package com.pengchun.FunctionalInterface;

/**
 * @Author 彭淳
 * @Date 2021/4/11
 * 被@FuncationalInterface注解的接口。可以直接通过lamda实现其接口，但接口必须只能由一个方法
 */
@FunctionalInterface
public interface FunctionalInterfaceImpl {
    public void functionalInterfaceImpl(String Message);
}
