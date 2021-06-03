package com.pengchun;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 彭淳
 * @Date 2021/3/23
 */
public class aaa {
    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        CASDemo casDemo = new CASDemo();
        CASDemo casDemo1 = new CASDemo();

        System.out.println(casDemo.equals(casDemo1));
        System.out.println(casDemo == casDemo1);

    }
}
