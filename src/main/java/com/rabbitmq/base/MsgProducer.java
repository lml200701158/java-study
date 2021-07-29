package com.rabbitmq.base;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MsgProducer {
    public static void publishMsg(String exchange, BuiltinExchangeType exchangeType, String toutingKey, String message) throws IOException, TimeoutException {
        ConnectionFactory factory = RabbitUtil.getConnectionFactory();
        //创建连接
        Connection connection = factory.newConnection();
        //创建消息通道
        Channel channel = connection.createChannel();
        // 声明exchange中的消息为可持久化，不自动删除
        channel.exchangeDeclare(exchange, exchangeType, true, false, null);

        // 发布消息
        channel.basicPublish(exchange, toutingKey, null, message.getBytes());

        System.out.println("Sent '" + message + "'");
        channel.close();
        connection.close();
    }
}
