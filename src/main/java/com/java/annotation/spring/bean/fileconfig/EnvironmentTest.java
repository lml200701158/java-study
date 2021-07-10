package com.java.annotation.spring.bean.fileconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@ComponentScan({"com.java.annotation.spring.bean.fileconfig"})
@Component
@PropertySource("classpath:jdbc.properties")
public class EnvironmentTest {
    @Resource
    Environment environment;

    private String url;
    private String userName;
    private String passWord;

    public void getData() {
        url = environment.getProperty("jdbc.shop.url");
        userName = environment.getProperty("jdbc.shop.username");
        passWord = environment.getProperty("jdbc.shop.password");
        System.out.println("url:" + url);
        System.out.println("userName:" + userName);
        System.out.println("passWord:" + passWord);
    }

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EnvironmentTest.class);
        EnvironmentTest connection = context.getBean(EnvironmentTest.class);
        connection.getData();
    }
}
