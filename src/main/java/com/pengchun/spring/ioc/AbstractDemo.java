package com.pengchun.spring.ioc;

/**
 * @Author 彭淳
 * @Date 2021/3/23
 */
public class AbstractDemo {
    private Integer a;
    public static void main(String[] args) {
        AbstractAA abstractAA = new AbstractC(4);
        abstractAA.c();
    }
}
