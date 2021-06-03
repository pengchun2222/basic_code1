package com.pengchun.head_first.strantagy.two.behavior;

import com.pengchun.head_first.strantagy.two.interfaceBehavior.QuackBehavior;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 实现行为接口叫的行为
 * 嘎嘎叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎");
    }
}
