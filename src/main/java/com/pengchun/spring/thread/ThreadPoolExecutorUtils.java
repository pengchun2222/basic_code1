package com.pengchun.spring.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author 彭淳
 * @Date 2021/3/26
 * 线程池
 */
// @Configuration
public class ThreadPoolExecutorUtils {

    // @Bean
    public static ThreadPoolExecutor taskExecutor() {
        // 创建线程池工程设置命名
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("pool-%d").build();

        // 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(20
                , Integer.MAX_VALUE
                , 3
                , TimeUnit.SECONDS
                , new LinkedBlockingQueue<Runnable>()
                , namedThreadFactory
                , new ThreadPoolExecutor.AbortPolicy());
        return threadPoolExecutor;
    }
}
