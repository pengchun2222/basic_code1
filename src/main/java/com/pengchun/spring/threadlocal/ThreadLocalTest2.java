package com.pengchun.spring.threadlocal;

/**
 * @Author 彭淳
 * @Date 2021/3/24
 */
public class ThreadLocalTest2 {
    public void demo() {
        Object o = ThreadLoalPojo.threadLocal.get();
        System.out.println(Thread.currentThread().getName() + "-----" + o);
    }
}
