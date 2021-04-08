package com.pengchun;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.pengchun.spring.threadlocal.Pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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
        System.out.println(new Timestamp(System.currentTimeMillis()));


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

        ArrayList<Pojo> arrayList = new ArrayList<Pojo>() {{
            add(new Pojo(1));
            add(new Pojo(2));
            add(new Pojo(3));
            add(new Pojo(4));
            add(new Pojo(5));
        }};
//        for (int i1 = 0; i1 < 1000; i1++) {
//            threadPoolExecutor.execute(() -> {
//                noCasImp(); //8.777125472973825E113
//                System.out.println(Thread.currentThread().getName());
//
//            });
//        }

        for (Pojo pojo : arrayList) {
            threadPoolExecutor.execute(() -> {
                System.out.println(pojo.getA());
                while (true) {

                }
            });


        }


        threadPoolExecutor.awaitTermination(5L, TimeUnit.SECONDS);
        System.out.println(i);
        for (Pojo pojo : arrayList) {
            threadPoolExecutor.execute(() -> {
                System.out.println(pojo.getA());
                while (true) {

                }
            });


        }
        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(5L, TimeUnit.SECONDS);


        System.out.println(i);
    }

    /**
     * cas操作
     */
    public static void casImp() {
        double a = i;
        double b = i * 1.3;
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
