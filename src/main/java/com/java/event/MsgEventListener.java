package com.java.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class MsgEventListener implements ApplicationListener<MsgEvent> {
    @Override
    public void onApplicationEvent(MsgEvent event) {
        System.out.println("receive msg event: " + event);
    }
}
