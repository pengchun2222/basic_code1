package com.pengchun.spring.demo;

import lombok.Data;

/**
 * @Author 彭淳
 * @Date 2021/4/14
 */

public class B {
    private String name;
    private A a;

    public B() {
    }

    public B(String name, A a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
