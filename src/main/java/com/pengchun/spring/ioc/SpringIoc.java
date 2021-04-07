package com.pengchun.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;
import java.util.HashMap;

/**
 * @Author 彭淳
 * @Date 2021/3/22
 */
public class SpringIoc {
    public static void main(String[] args) throws FileNotFoundException {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
//        System.out.println("context 启动成功");
//
//
//        MessageServiceImpl bean = classPathXmlApplicationContext.getBean(MessageServiceImpl.class);
//        String message = bean.getMessage();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,1);

    }
}
