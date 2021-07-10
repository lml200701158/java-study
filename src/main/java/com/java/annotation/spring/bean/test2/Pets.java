package com.java.annotation.spring.bean.test2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class Pets {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    public static void main(String args[]) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Pets pets=context.getBean("pets", Pets.class);
        System.out.println(pets.toString());
    }
}
