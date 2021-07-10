package com.java.spring.factorybean1;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(JUnit4ClassRunner.class)
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
        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("fbHelloWorldService");
        //helloWorldService.getBeanName();
        helloWorldService.printDesc();
    }
}
