package com.java.spring.aop.xml2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAspect {
    // 前置通知
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知，方法名称:" + joinPoint.getSignature().getName());
    }
    // 后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("后置通知，方法名称：" + joinPoint.getSignature().getName());
    }
    // 环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始"); // 开始
        Object obj = proceedingJoinPoint.proceed(); // 执行当前目标方法
        System.out.println("环绕结束"); // 结束
        return obj;
    }
    // 异常通知
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("异常通知，出错了");
    }
    // 最终通知
    public void myAfter() {
        System.out.println("最终通知");
    }
}
