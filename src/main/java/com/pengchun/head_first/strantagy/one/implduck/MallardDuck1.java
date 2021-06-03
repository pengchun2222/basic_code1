package com.pengchun.head_first.strantagy.one.implduck;

import com.pengchun.head_first.strantagy.one.duck.Duck;
import com.pengchun.head_first.strantagy.one.duck.Duck1;
import com.pengchun.head_first.strantagy.one.interfaceAble.FlyAble;
import com.pengchun.head_first.strantagy.one.interfaceAble.QuackAble;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 绿头鸭
 *
 * 那么我们把飞和叫的方法独自作为一个接口
 * 那么每一个会飞的都需要实现飞的接口
 * 每一个会叫的都要实现叫的接口
 * 这样就解决了不是所有鸭子都会叫，所有鸭子都会飞
 *
 * 但是会造成重复代码变得更多，每一个会飞会叫的子类都必须实现接口
 */
public class MallardDuck1 extends Duck1 implements FlyAble, QuackAble {
    @Override
    public void display() {
        System.out.println("绿头鸭");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void quack() {
        System.out.println("叫");
    }
}
