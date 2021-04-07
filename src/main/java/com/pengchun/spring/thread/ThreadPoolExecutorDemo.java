package com.pengchun.spring.thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author 彭淳
 * @Date 2021/4/1
 */
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolExecutorUtils.taskExecutor();
        ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<>();
        Integer i = 200;
        integerThreadLocal.set(100);
        threadPoolExecutor.execute(() -> {
            System.out.println("chucuole");
            Integer integer = integerThreadLocal.get();
            System.out.println(integer);
            System.out.println(i);
        });

        try {
            throw new RuntimeException("出错了");
        } catch (RuntimeException e) {

        }

        System.out.println("执行结束");
        threadPoolExecutor.shutdown();
    }
}
