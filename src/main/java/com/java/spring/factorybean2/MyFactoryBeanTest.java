package com.java.spring.factorybean2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFactoryBeanTest {
    /**
     * 测试验证FactoryBean原理，代理一个servcie在调用其方法的前后，打印日志亦可作其他处理
     * 从ApplicationContext中获取自定义的FactoryBean
     * context.getBean(String beanName) ---> 最终获取到的Object是FactoryBean.getObejct(),
     * 使用Proxy.newInstance生成service的代理类
     */
    @Test
    public void testFactoryBean() {
        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car.toString());
    }
}
