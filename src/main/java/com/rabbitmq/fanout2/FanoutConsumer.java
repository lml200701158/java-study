package com.rabbitmq.fanout2;

import com.rabbitmq.base.MsgConsumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class FanoutConsumer {
    private static final String EXCHANGE_NAME = "fanout.exchange.v2";
    public void msgConsumer() {
        try {
            MsgConsumer.consumerMsgV2(EXCHANGE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FanoutConsumer consumer = new FanoutConsumer();
        for (int i = 0; i < 3; i++) {
            consumer.msgConsumer();
        }
    }
}
