package com.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class penguinProxy implements InvocationHandler {

   private Object obj; // 被代理的对象

    public penguinProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
        System.out.println("海外动态代理调用方法:" + method.getName());
        Object result = method.invoke(obj, args);
        return result;
    }
}