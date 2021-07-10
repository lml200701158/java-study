package com.java.spring.aop.xml;

import com.java.annotation.spring.bean.test4.Pets;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDaoProxy");
        customerDao.add();
        customerDao.update();
        // customerDao.delete();
        // customerDao.find();
    }
}
