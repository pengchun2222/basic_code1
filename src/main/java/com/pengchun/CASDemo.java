package com.pengchun;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @Author 彭淳
 * @Date 2021/3/14
 */
public class CASDemo {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;

        // 创建线程池工程设置命名
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("hyn-demo-pool-%d").build();

        // 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2
                , Integer.MAX_VALUE
                , 30
                , TimeUnit.SECONDS
                , new LinkedBlockingQueue<Runnable>()
                , namedThreadFactory
                , new ThreadPoolExecutor.AbortPolicy());
        for (int i1 = 0; i1 < i; i1++) {
            threadPoolExecutor.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });

        }

        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(1000L,TimeUnit.SECONDS);
    }


}
