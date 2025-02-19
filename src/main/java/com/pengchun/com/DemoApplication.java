package com.pengchun.com;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @Author 彭淳
 * @Date 2021/3/27
 */
//@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class DemoApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class,args);
//
//    }

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    CD cd;
    @GetMapping("/test")
    public String abc() throws InterruptedException, ExecutionException {
       return cd.a();


    }
    @GetMapping("/test1")
    public String abc1() throws InterruptedException, ExecutionException {
       return cd.b();
    }
}
