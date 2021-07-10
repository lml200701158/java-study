package com.java.annotation.spring.bean.test1;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class Pets {
    private Cat cat;
    private Dog dog;
    public static void main(String args[]) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Pets pets=context.getBean("pets",Pets.class);
        System.out.println(pets.toString());
    }
}
