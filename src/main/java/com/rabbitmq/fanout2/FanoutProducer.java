package com.rabbitmq.fanout2;

import com.rabbitmq.base.MsgProducer;
import com.rabbitmq.client.BuiltinExchangeType;

public class FanoutProducer {
    private static final String EXCHANGE_NAME = "fanout.exchange.v2";
    public void publishMsg(String msg) {
        try {
            MsgProducer.publishMsgV2(EXCHANGE_NAME, BuiltinExchangeType.FANOUT, msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        FanoutProducer directProducer = new FanoutProducer();
        String msg = "hello >>> ";
        for (int i = 0; i < 10000; i++) {
            directProducer.publishMsg(msg + i);
        }
    }
}
