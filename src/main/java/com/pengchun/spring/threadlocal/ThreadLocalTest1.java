package com.pengchun.spring.threadlocal;

/**
 * @Author 彭淳
 * @Date 2021/3/24
 */
public class ThreadLocalTest1 {
    public static void main(String[] args) {
        new Thread(() -> {
            Thread.currentThread().setName("火箭1号");
            ThreadLoalPojo.threadLocal.set("火箭1号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();
        new Thread(() -> {
            Thread.currentThread().setName("火箭2号");
            ThreadLoalPojo.threadLocal.set("火箭2号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();
        new Thread(() -> {
            Thread.currentThread().setName("火箭3号");
            ThreadLoalPojo.threadLocal.set("火箭3号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();new Thread(() -> {
            Thread.currentThread().setName("火箭4号");
            ThreadLoalPojo.threadLocal.set("火箭4号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();
        new Thread(() -> {
            Thread.currentThread().setName("火箭5号");
            ThreadLoalPojo.threadLocal.set("火箭5号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();
        new Thread(() -> {
            Thread.currentThread().setName("火箭6号");
            ThreadLoalPojo.threadLocal.set("火箭6号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();
        new Thread(() -> {
            Thread.currentThread().setName("火箭7号");
            ThreadLoalPojo.threadLocal.set("火箭7号");
            ThreadLocalTest2 threadLocalTest = new ThreadLocalTest2();
            threadLocalTest.demo();
        }).start();
        ThreadLoalPojo.threadLocal.set(123);
        System.out.println(ThreadLoalPojo.threadLocal.get());
    }
}
