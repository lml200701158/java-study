package com.lvmenglou.demo2;
import com.lvmenglou.action.PersonAction;
import com.lvmenglou.person.Person;
import com.lvmenglou.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
        // 直接打印"Hello World!"
        System.out.println("直接打印：Hello World!\n");

        // 通过xml方式
        System.out.println("通过xml方式实现spring:");
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person + "\n");

        // 通过注解注入
        System.out.println("通过注解方式实现spring:");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personServer = (PersonService) applicationContext.getBean("personService");
        personServer.add();
        PersonAction personAction = (PersonAction) applicationContext.getBean("personAction");
        personAction.add();
    }
}
