package com.java.annotation.spring.bean.Transactional;

import com.mybatis.controller.UserController;
import com.mybatis.entity.MyUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 用于测试MyBatis和Spring的集成
public class SpringMyBatisTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController uc = (UserController) applicationContext.getBean("userController");
        try {
            uc.testSuccess();
        } finally {
            MyUser user =  uc.query(1);
            System.out.println("修改后的记录:" + user);
        }
    }
}