package com.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class test {
    public static void main(String args[]) {
        penguin penguin1 = new littlePenguin();
        // 创建动态代理
        penguinProxy proxy = new penguinProxy(penguin1);
        // 获取ClassLoader
        //ClassLoader loader = penguin1.getClass().getClassLoader();
        ClassLoader loader = proxy.getClass().getClassLoader();
        // 通过Proxy创建代理实例，实际上通过反射来实现的
        penguin penguin2 = (penguin) Proxy.newProxyInstance(loader, new Class[]{penguin.class}, proxy);
        penguin2.beating();
    }
}