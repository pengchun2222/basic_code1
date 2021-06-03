package com.pengchun.head_first.strantagy.two.behavior;

import com.pengchun.head_first.strantagy.two.interfaceBehavior.FlyBehavior;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 具体的行为类实现行为接口
 * 做出自己的实现
 * 飞
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行");
    }
}
