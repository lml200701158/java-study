package com.java.annotation.spring.bean.test4;
import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Data
//public class Pets {
//    @Autowired
//    private Animal dog;
//    @Autowired
//    private Animal cat;
//    public static void main(String args[]) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pets pets=context.getBean("pets", Pets.class);
//        System.out.println(pets.toString());
//    }
//}

//@Data
//public class Pets {
//    @Autowired
//    @Qualifier("dog")
//    private Animal dog1;
//    @Autowired
//    private Animal cat;
//    public static void main(String args[]) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pets pets=context.getBean("pets", Pets.class);
//        System.out.println(pets.toString());
//    }
//}

//@Data
//public class Pets {
//    @Autowired
//    private Dog dog1;
//    @Autowired
//    private Cat cat1;
//    public static void main(String args[]) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pets pets=context.getBean("pets", Pets.class);
//        System.out.println(pets.toString());
//    }
//}

//@Data
////@Service
//public class Pets {
//    @Resource
//    private Cat cat;
//    public static void main(String args[]) {
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        org.springframework.core.io.Resource res = resolver.getResource("classpath:applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(res);
//        Pets pets=factory.getBean("pets", Pets.class);
//        System.out.println(pets.toString());
//    }
//}
//@Autowired
//@Resource(name = "miniCat")
//@Resource(type = Cat.class)


//@Data
//@Service
//public class Pets {
//    @Resource
//    private Dog dog;
//    @Resource(name = "miniCat")
//    private Cat cat;
//    public static void main(String args[]) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        //ApplicationContext context =new ClassPathXmlApplicationContext("file:/Users/mengloulv/java-workspace/Demo5/src/main/resources/applicationContext.xml");
//        Pets pets=context.getBean("pets", Pets.class);
//        System.out.println(pets.toString());
//
////        ApplicationContext context =new FileSystemXmlApplicationContext("file:/Users/mengloulv/java-workspace/Demo5/src/main/resources/applicationContext.xml");
////        Pets pets=context.getBean("pets", Pets.class);
////        System.out.println(pets.toString());
//
////        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
////        org.springframework.core.io.Resource res = resolver.getResource("classpath:applicationContext.xml");
////        BeanFactory factory = new XmlBeanFactory(res);
////        Pets pets=factory.getBean("pets", Pets.class);
////        System.out.println(pets.toString());
//    }
//}

@Data
@Service
public class Pets {
    @Resource
    private Dog dog;
    @Resource
    private Cat cat;
    public static void main(String args[]) {
        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Pets pets=context.getBean("pets", Pets.class);
        System.out.println(pets.toString());
    }
}
