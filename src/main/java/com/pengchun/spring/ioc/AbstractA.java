package com.pengchun.spring.ioc;

/**
 * @Author 彭淳
 * @Date 2021/3/23
 */
abstract class AbstractA extends AbstractAA{
    int a;
    public void a () {
        b();
        System.out.println(a);
    }

    public AbstractA(int a) {
        super(a);
        this.a = a;
    }

    @Override
    public abstract void b();
}
