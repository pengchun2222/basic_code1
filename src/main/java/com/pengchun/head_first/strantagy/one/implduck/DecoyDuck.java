package com.pengchun.head_first.strantagy.one.implduck;

import com.pengchun.head_first.strantagy.one.duck.Duck;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 这是一只饵鸭（木头鸭子）
 * 它不会飞也不会叫
 * 那么他需要重写fly()和quack()方法
 * 那么每一种新鸭子的创建都需要在实现类里覆盖fly()和quack()，这是无休止的
 * @see Duck
 */
public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("这是一只饵鸭");
    }

    @Override
    public void quack() {
    }

    @Override
    public void fly() {
    }
}
