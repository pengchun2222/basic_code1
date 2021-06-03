package com.pengchun.head_first.strantagy.two;

import com.pengchun.head_first.strantagy.two.behavior.FlyRocketPowered;
import com.pengchun.head_first.strantagy.two.behavior.Quack;
import com.pengchun.head_first.strantagy.two.implDuck.MallardDuck;
import com.pengchun.head_first.strantagy.two.implDuck.ModelDuck;
import com.pengchun.head_first.strantagy.two.interfaceBehavior.FlyBehavior;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 */
public class Test {
//    public static void main(String[] args) {
//        MallardDuck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();
//    }

    public static void main(String[] args) {
        // 多态的形式创建docker
        Duck duck = new ModelDuck();
        // 调用飞和叫的方法
        duck.performFly();
        duck.performQuack();

        // 动态设置飞的行为实现类和叫的行为实现类
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.setQuackBehavior(new Quack());
        // 飞和叫都改变了
        duck.performFly();
        duck.performQuack();
    }
}
