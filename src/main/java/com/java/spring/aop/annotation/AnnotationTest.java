package com.java.spring.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java.spring.aop.customer.*;

public class AnnotationTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从spring容器获取实例
        CustomerDaoImpl customerDao = (CustomerDaoImpl) applicationContext.getBean("customerDao");
        // 执行方法
        customerDao.add();
    }
}
