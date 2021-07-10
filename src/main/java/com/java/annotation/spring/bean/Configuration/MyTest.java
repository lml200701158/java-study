package com.java.annotation.spring.bean.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyConfiguration myConfiguration = context1.getBean(MyConfiguration.class);
        System.out.println(myConfiguration.toString());
    }
}
