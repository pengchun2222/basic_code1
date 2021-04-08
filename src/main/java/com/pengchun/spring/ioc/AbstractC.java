package com.pengchun.spring.ioc;

/**
 * @Author 彭淳
 * @Date 2021/3/23
 */
public class AbstractC extends AbstractA{
    public AbstractC(int a) {
        super(a);
    }

    @Override
    public void b() {
        System.out.println("CCCCCCCCCCC");
    }
}
