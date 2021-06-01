package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author 彭淳
 * @Date 2021/4/9
 */
@SpringBootApplication
public class ApplicationDemo {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationDemo.class,args);

    }
}
