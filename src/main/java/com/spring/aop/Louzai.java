package com.spring.aop;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Louzai {

    public void everyDay() {
        System.out.println("睡觉");
    }
}

