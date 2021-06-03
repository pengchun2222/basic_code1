package com.pengchun.spring.demo;

import lombok.Data;

/**
 * @Author 彭淳
 * @Date 2021/4/14
 */
public class A {
    private String name;
    private B b;

    public A() {
    }

    public  A(String name, B b) {
        this.name = name;
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
