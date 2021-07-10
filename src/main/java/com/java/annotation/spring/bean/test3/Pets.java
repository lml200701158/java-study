package com.java.annotation.spring.bean.test3;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Data
//@Service
public class Pets {
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    public static void main(String args[]) {
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Pets pets=context.getBean("pets", Pets.class);
        System.out.println(pets.toString());
    }
}
