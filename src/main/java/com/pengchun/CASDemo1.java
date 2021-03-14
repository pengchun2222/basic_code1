package com.pengchun;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author 彭淳
 * @Date 2021/3/14
 */
public class CASDemo1 {
    static double i = 1;

    public static void main(String[] args) throws InterruptedException {


        // 创建线程池工程设置命名
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("hyn-demo-pool-%d").build();

        // 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(200
                , Integer.MAX_VALUE
                , 30
                , TimeUnit.SECONDS
                , new LinkedBlockingQueue<Runnable>()
                , namedThreadFactory
                , new ThreadPoolExecutor.AbortPolicy());

        for (int i1 = 0; i1 < 1000; i1++) {
            threadPoolExecutor.execute(new Runnable() {
                public void run() {
                    noCasImp(); //8.777125472973825E113
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(1000000L,TimeUnit.SECONDS);
        System.out.println(i);
    }

    /**
     * cas操作
     */
    public static void casImp() {
        double a = i;
        double b = i  * 1.3;
        if (a == i) {
            i = b;
        } else {
            casImp();
        }
    }

    /**
     * 非cas操作
     */
    public static void noCasImp() {
        i = i * 1.01;
    }
}
