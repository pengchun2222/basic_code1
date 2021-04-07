package com.pengchun;


import org.openjdk.jol.info.ClassLayout;

/**
 * @Author 彭淳
 * @Date 2021/3/13
 */
public class ObjectDemo {

    static class  T{
        long a;
    }
    public static void main(String[] args) {
        T o = new T();
        // 打印对象在内存中的布局
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
