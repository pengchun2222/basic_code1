package com.pengchun.synchronizeddemo;

import lombok.SneakyThrows;

/**
 * @Author 彭淳
 * @Date 2021/5/11
 */
public class Demo {
    public static void main(String[] args) {
        new Thread(() -> {
            A();
        }).start();
        new Thread(() -> {
            B();
        }).start();
    }

    @SneakyThrows
    public static  void A() {
        System.out.println("A");
        Thread.sleep(3000);
        B();
    }

    public static  void B() {
        System.out.println("B");
        Demo1.C();
    }
}
