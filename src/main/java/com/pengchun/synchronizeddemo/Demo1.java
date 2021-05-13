package com.pengchun.synchronizeddemo;

/**
 * @Author 彭淳
 * @Date 2021/5/11
 */
public class Demo1 {

    public static Integer a  = 10000;

    public static void  C() {
        synchronized (new Object()) {
            if(a >=1) {
                a--;
            }else {
                return ;
            }
            System.out.println(Thread.currentThread().getName() + "->>>>>" + a);
        }
    }

    public static void main(String[] args) {
        while(true) {
            new Thread(() -> {
                C();
            }).start();
            new Thread(() -> {
                C();
            }).start();
            new Thread(() -> {
                C();
            }).start();
            new Thread(() -> {
                C();
            }).start();
            new Thread(() -> {
                C();
            }).start();
        }
    }
}
