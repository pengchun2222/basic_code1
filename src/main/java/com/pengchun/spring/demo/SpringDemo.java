package com.pengchun.spring.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author 彭淳
 * @Date 2021/4/13
 */
public class SpringDemo implements BeanPostProcessor {

    @Autowired
    RedisTemplate redisTemplate;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Object a = ca.getBean("A");
        System.out.println(a);

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }


}
