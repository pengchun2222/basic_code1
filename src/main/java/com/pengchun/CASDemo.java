package com.pengchun;

import java.util.concurrent.*;

/**
 * @Author 彭淳
 * @Date 2021/3/14
 */
public class CASDemo {
    public static void main(String[] args) {
        int i = 10;

        // 创建线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 30, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());


    }

    public void simulationCas() {

    }
}
