package com.pengchun.reflect;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author 彭淳
 * @Date 2021/4/11
 */
public class ReflectDemo {
    @SneakyThrows
    public static void main(String[] args) {
        // 通过放射获取Class对象
        Class<?> aClass = Class.forName("com.pengchun.reflect.Student");

        // 使用无参构造创建方法
        Student student = (Student) aClass.newInstance();
        System.out.println(student);

        //有参构造创建方法
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class,Integer.class);
        Student student1 = (Student) declaredConstructor.newInstance("彭淳", 123);
        System.out.println(student1);

        //调用方法
        Method getName = aClass.getDeclaredMethod("getName");
        Object invoke = getName.invoke(student1, null);
        System.out.println(invoke);

        // 通过放射操作属性
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student1,"屈彦玲");
        System.out.println(student1);
    }
}
