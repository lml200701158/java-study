package com.rabbitmq.direct;

import com.rabbitmq.base.MsgProducer;
import com.rabbitmq.client.BuiltinExchangeType;

public class DirectProducer {
    private static final String EXCHANGE_NAME = "direct.exchange";
    public void publishMsg(String routingKey, String msg) {
        try {
            MsgProducer.publishMsg(EXCHANGE_NAME, BuiltinExchangeType.DIRECT, routingKey, msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        DirectProducer directProducer = new DirectProducer();
        String[] routingKey = new String[]{"aaa", "bbb", "ccc"};
        String msg = "hello >>> ";
        for (int i = 0; i < 10; i++) {
            directProducer.publishMsg(routingKey[i % 3], msg + i);
        }
        System.out.println("----over-------");
    }
}
