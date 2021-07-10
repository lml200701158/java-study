package com.java.annotation.spring.bean.Configuration;

import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
@ToString
public class MyConfiguration {
    private String name = "配置测试";
    @Bean(name="louzai")
    @Description("此方法的bean名称为louzai")
    public MyBean myBean(){
        System.out.println("myBean Initialized");
        return new MyBean();
    }
}

