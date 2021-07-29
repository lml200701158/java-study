package com.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.junit.Test;

import java.util.concurrent.TimeoutException;

public class RabbitMqTest {
    //消息队列名称
    private final static String QUEUE_NAME = "hello";

    @Test
    public void send() throws java.io.IOException, TimeoutException {
        //创建连接工程
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        //创建连接
        Connection connection = factory.newConnection();
        //创建消息通道
        Channel channel = connection.createChannel();
        //生成一个消息队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);

        for (int i = 0; i < 10; i++) {
            String message = "Hello World RabbitMQ count: " + i;
            //发布消息，第一个参数表示路由（Exchange名称），为""则表示使用默认消息路由
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
        //关闭消息通道和连接
        channel.close();
        connection.close();
    }

    @Test
    public void consumer() throws java.io.IOException, TimeoutException, InterruptedException {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        //创建连接
        Connection connection = factory.newConnection();
        //创建消息信道
        final Channel channel = connection.createChannel();
        //消息队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        System.out.println("[*] Waiting for message. To exist press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Received '" + message + "'");
        };
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {});

        Thread.sleep(1000 * 60 * 100);
    }
}
