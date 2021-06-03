package com.pengchun.head_first.strantagy.one.duck;

/**
 * @Author 彭淳
 * @Date 2021/5/19
 * 鸭子类
 */
public abstract class Duck {

    /**
     * 鸭子会叫会游泳是所有鸭子的特性，他们都是共通的，但是每个鸭子的外观都不一样
     */

    /**
     * 叫声
     */
    public void quack(){
        System.out.println("鸭子在嘎嘎叫");
    }

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
     *
     */
    public void fly() {
        System.out.println("飞");
    }

}
