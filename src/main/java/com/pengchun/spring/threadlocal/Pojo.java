package com.pengchun.spring.threadlocal;




/**
 * @Author 彭淳
 * @Date 2021/3/24
 */

public class Pojo {
    private static ThreadLocal threadLocal = new ThreadLocal();
    private int a;

    public Pojo(int a) {
        this.a = a;
    }

    public static ThreadLocal getThreadLocal() {
        return threadLocal;
    }

    public static void setThreadLocal(ThreadLocal threadLocal) {
        Pojo.threadLocal = threadLocal;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
