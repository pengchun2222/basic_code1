package com.pengchun.redis;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author 彭淳
 * @Date 2021/4/9
 */
@Service
public class RedisLockDemo {
    @Autowired
    StringRedisTemplate redisTemplate;

    private static final String KEY = "redis:lock:seckill";
    private static final String INVENTORY = "redis:lock:inventory";
    ThreadLocal threadLocal = new ThreadLocal();

    @Autowired
    RedissonClient redissonClient;

    public boolean seckill() {

        // 为当前线程设置值
        threadLocal.set(UUID.randomUUID().toString());
        // 使用唯一key为key，当前线程存储的uuid为值，过期时间 2秒，设置过期时间
        Boolean flag = redisTemplate.opsForValue().setIfAbsent(KEY, (String) threadLocal.get(), 1, TimeUnit.SECONDS);

        if (!flag) {
            while (true) {
                Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(KEY, (String) threadLocal.get(), 30, TimeUnit.SECONDS);
                if (aBoolean) {
                    break;
                }
            }
        }
        String o = (String) redisTemplate.opsForValue().get(INVENTORY);

        if(Integer.valueOf(o) <= 0) {
            redisTemplate.delete(KEY);
            return false;
        }
        // 异步续命 不可用 用线程池 完事后给关掉。
      /*  new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    System.out.println("阻塞了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();*/

        Long decrement = redisTemplate.opsForValue().decrement(INVENTORY);



        if (threadLocal.get().equals(redisTemplate.opsForValue().get(KEY))) {

            redisTemplate.delete(KEY);
        }



        return true;
    }


    public void run() {
        redisTemplate.opsForValue().set(INVENTORY,"500");
    }

    public String get() {
        RLock lock = redissonClient.getLock("");
        lock.tryLock();
        lock.lock();
        return redisTemplate.opsForValue().get(INVENTORY);
    }

}
