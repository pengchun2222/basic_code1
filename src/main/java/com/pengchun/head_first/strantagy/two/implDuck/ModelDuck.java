package com.pengchun.head_first.strantagy.two.implDuck;

import com.pengchun.head_first.strantagy.two.Duck;
import com.pengchun.head_first.strantagy.two.behavior.FlyNoWings;
import com.pengchun.head_first.strantagy.two.behavior.FlyRocketPowered;
import com.pengchun.head_first.strantagy.two.behavior.Squeak;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 火箭鸭子
 * 要实现火箭鸭子
 * 我们只需要创建一个新的飞行行为实现类即可，并且不会影响到别的飞行鸭
 */
public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("火箭鸭");
    }

    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWings();
    }


}
