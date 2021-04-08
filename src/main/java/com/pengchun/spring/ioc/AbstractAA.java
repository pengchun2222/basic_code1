package com.pengchun.spring.ioc;

/**
 * @Author 彭淳
 * @Date 2021/3/23
 */
public abstract class AbstractAA {
    int a;

    public AbstractAA(int a) {
        this.a = a;
    }

    public void c() {
        System.out.println(a + "AbstractAA");
    }

    public abstract void b();
}
