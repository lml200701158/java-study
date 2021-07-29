package com.rabbitmq.fanout1;

import com.rabbitmq.base.MsgConsumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class FanoutConsumer {
    private static final String EXCHANGE_NAME = "fanout.exchange";
    public void msgConsumer(String queueName, String routingKey) {
        try {
            MsgConsumer.consumerMsg(EXCHANGE_NAME, queueName, routingKey);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FanoutConsumer consumer = new FanoutConsumer();
        String[] queueNames = new String[]{"qa-2", "qb-2", "qc-2"};
        for (int i = 0; i < 3; i++) {
            consumer.msgConsumer(queueNames[i], "");
        }
    }
}
