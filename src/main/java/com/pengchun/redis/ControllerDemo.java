package com.pengchun.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 彭淳
 * @Date 2021/4/9
 */
@RequestMapping("/basic")
@RestController
public class ControllerDemo {
    @Autowired
    private RedisLockDemo redisLockDemo;

    @GetMapping("/seckill")
    public String seckill() {
        boolean seckill = redisLockDemo.seckill();
        return "ok";
    }

    @GetMapping("/init")
    public void init() {
        redisLockDemo.run();
    }
    @GetMapping("/get")
    public String get() {
        return redisLockDemo.get();
    }
}
