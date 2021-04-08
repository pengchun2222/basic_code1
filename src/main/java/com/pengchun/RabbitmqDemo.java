package com.pengchun;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 彭淳
 * @Date 2021/3/15
 */
public class RabbitmqDemo {
    private static RabbitTemplate rabbitTemplate;
    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            System.out.println(1);
        }).start();
        new Thread(() -> {
            System.out.println(2);
        }).start();
        new Thread(() -> {
            System.out.println(3);
        }).start();
        new Thread(() -> {
            System.out.println(4);
        }).start();
        new Thread(() -> {
            System.out.println(5);
        }).start();
        new Thread(() -> {
            System.out.println(6);
        }).start();
        
        System.out.println(7);

    }

    @RabbitListener
    public void aaa(Channel channel) throws InterruptedException {


    }
}
