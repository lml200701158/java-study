package com.java.annotation.spring.bean.Configuration;

public class MyBean {
    public MyBean(){
        System.out.println("generate MyBean Instance");
    }
    public void init(){
        System.out.println("MyBean Resources Initialized");
    }
}
