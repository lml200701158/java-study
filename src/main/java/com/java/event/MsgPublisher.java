package com.java.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@ComponentScan({"com.java.event"})
public class MsgPublisher implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    // 发起事件通知
    public void publish(String msg) {
        applicationContext.publishEvent(new MsgEvent(this, msg));
    }

    // 通过注解的方法
    @EventListener(MsgEvent.class)
    public void consumer(MsgEvent msgEvent) {
        System.out.println("receive msg event by @anno: " + msgEvent);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MsgPublisher.class);
        MsgPublisher msgPublisher = context.getBean(MsgPublisher.class);
        msgPublisher.publish("louzai");
    }
}
