package com.pengchun.head_first.strantagy.two.behavior;

import com.pengchun.head_first.strantagy.two.interfaceBehavior.FlyBehavior;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("火箭飞行");
    }
}
