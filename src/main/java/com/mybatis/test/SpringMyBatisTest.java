package com.mybatis.test;

import com.mybatis.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 用于测试MyBatis和Spring的集成
public class SpringMyBatisTest {
    public static void main(String[] args) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserController uc = (UserController) applicationContext.getBean("userController");
//        uc.test();
    }
}