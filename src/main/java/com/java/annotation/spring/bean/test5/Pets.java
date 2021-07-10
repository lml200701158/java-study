package com.java.annotation.spring.bean.test5;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Data
@Service
@ComponentScan({"com.java.annotation.spring.bean.test5"})
//@ComponentScan(basePackageClasses = {Dog.class, Cat.class, Pets.class})
public class Pets {
    @Resource
    private Dog dog;
    @Resource
    private Cat cat;
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Pets.class);
        Pets pets = context.getBean(Pets.class);
        System.out.println(pets.toString());
    }
}