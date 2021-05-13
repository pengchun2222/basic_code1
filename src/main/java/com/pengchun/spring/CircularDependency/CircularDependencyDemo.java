package com.pengchun.spring.CircularDependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 彭淳
 * @Date 2021/4/18
 */
public class CircularDependencyDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Application.xml");
        StudentA studentA = classPathXmlApplicationContext.getBean("studentA",StudentA.class);
        studentA.run();


    }
    public static Object  A(){
        System.out.println("A");
        return new Object();
    }
    public static void  B(Object A){
        System.out.println("B");
    }
}
