package com.pengchun.FunctionalInterface;

import org.springframework.web.bind.annotation.RequestBody;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;

/**
 * @Author 彭淳
 * @Date 2021/4/11
 */
public class Demo1 {
    public static void main(@RequestBody String[] args) {
        FunctionalInterfaceImpl functionalInterfaceImpl = a -> {
            System.out.println(a);
        };
        functionalInterfaceImpl.functionalInterfaceImpl("杀杀杀，杀猪刀");


        Annotation[] annotations = functionalInterfaceImpl.getClass().getAnnotations();
        System.out.println(annotations);
    }
}
