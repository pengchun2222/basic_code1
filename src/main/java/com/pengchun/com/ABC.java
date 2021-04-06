package com.pengchun.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author 彭淳
 * @Date 2021/3/27
 */
@Service
public class ABC implements CD {
    private int a = 1;

    @Autowired
    ThreadPoolExecutor threadPoolExecutor;

    @Override
    public String a() throws InterruptedException, ExecutionException {
        List<Future> futureList = new ArrayList<>();
        Future<?> submit = threadPoolExecutor.submit(() -> {
            System.out.println(1);
        });
        Future<?> submit1 = threadPoolExecutor.submit(() -> {
            System.out.println(2);
        });
        Future<?> submit2 = threadPoolExecutor.submit(() -> {
            System.out.println(3);
        });
        Future<?> submit3 = threadPoolExecutor.submit(() -> {
            System.out.println(4);
        });
        Future<?> submit4 = threadPoolExecutor.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(5);
            System.out.println("睡眠结束");
        });

        futureList.add(submit);
        futureList.add(submit1);
        futureList.add(submit2);
        futureList.add(submit3);
        futureList.add(submit4);
        for (Future future : futureList) {
            future.get();
        }

        List<Future> futureList1 = new ArrayList<>();
        Future<?> submit5 = threadPoolExecutor.submit(() -> {
            System.out.println(6);
        });

        Future<?> submit6 = threadPoolExecutor.submit(() -> {
            System.out.println(7);
        });
        Future<?> submit7 = threadPoolExecutor.submit(() -> {
            System.out.println(8);
        });
        Future<?> submit8 = threadPoolExecutor.submit(() -> {
            System.out.println(9);
        });
        Future<?> submit9 = threadPoolExecutor.submit(() -> {
            System.out.println(10);
        });
        futureList1.add(submit5);
        futureList1.add(submit6);
        futureList1.add(submit7);
        futureList1.add(submit8);
        futureList1.add(submit9);
        for (Future future : futureList1) {
            future.get();
        }

        System.out.println("结束");
        return "ok";
    }
    @Override
    @Transactional()
    public String b() throws InterruptedException, ExecutionException {
        List<Future> futureList = new ArrayList<>();
        threadPoolExecutor.execute(() -> {
            System.out.println(1);
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(2);
        });
         threadPoolExecutor.execute(() -> {
            System.out.println(3);
        });
         threadPoolExecutor.execute(() -> {
            System.out.println(4);
        });
        threadPoolExecutor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(5);
            System.out.println("睡眠结束");
        });



        threadPoolExecutor.execute(() -> {
            System.out.println(6);
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(7);
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(8);
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(9);
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(10);
        });





        return "ok";
    }


    public void sys() {
        System.out.println(a++);
    }
}
