package com.pengchun.head_first.strantagy.two;

import com.pengchun.head_first.strantagy.two.interfaceBehavior.FlyBehavior;
import com.pengchun.head_first.strantagy.two.interfaceBehavior.QuackBehavior;
import lombok.Data;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 鸭子类
 *
 * 然实现接口去叫去飞就可以了
 * 具体它是怎么叫的怎么飞的 duck种不关心
 */
@Data
public abstract class Duck {

    protected QuackBehavior quackBehavior;

    protected FlyBehavior flyBehavior;

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("鸭子在游泳");
    }

    /**
     * 外观，每只鸭子都有外观，但每一只鸭子的外观都不一样,所以需要子类有自己的实现
      */
    public abstract void display();

    /**
     * 飞
     * 委托飞的行为类实现
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 叫
     * 委托叫的行为类实现
     */
    public void performQuack() {
        quackBehavior.quack();
    }
}
