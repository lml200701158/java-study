package com.java.spring.aop.jdk;

public class MyAspect {
    public void myBefore() {
        System.out.println("方法执行之前");
    }
    public void myAfter() {
        System.out.println("方法执行之后");
    }
}
