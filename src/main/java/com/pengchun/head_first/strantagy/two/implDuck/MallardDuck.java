package com.pengchun.head_first.strantagy.two.implDuck;

import com.pengchun.head_first.strantagy.two.Duck;
import com.pengchun.head_first.strantagy.two.behavior.FlyWithWings;
import com.pengchun.head_first.strantagy.two.behavior.Quack;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 那么当绿头鸭继承Duck时
 * 我们只需要在构造函数中指定行为接口的实现类即可
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("绿头鸭");
    }

    public MallardDuck() {
        // 在生成MallardDuck的实例时，它的构造器会先初始化继承来的quackBehavior和flyBehavior变量初始化成具体的实例
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
