package com.pengchun.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 彭淳
 * @Date 2021/3/22
 */
public class SpringIoc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        System.out.println("context 启动成功");


        MessageServiceImpl bean = classPathXmlApplicationContext.getBean(MessageServiceImpl.class);
        String message = bean.getMessage();

        System.out.println(message);
    }
}
