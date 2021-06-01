package com.pengchun.head_first.strantagy.one.implduck;

import com.pengchun.head_first.strantagy.one.duck.Duck;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 这是一个橡胶鸭子
 * 在实现了鸭子的超类Duck后，橡胶鸭子也能飞了,并且也会叫了
 * 这是不对的，所以我们需要重写duck中的fly()和quack()，让他们有自己的实现
 * @see Duck
 */
public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("这是一个橡胶鸭子");
    }

    @Override
    public void quack() {
        System.out.println("鸭子在吱吱叫");
    }

    @Override
    public void fly() {
    }
}
