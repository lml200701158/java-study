package com.pattern.proxy;

public class test {
    public static void main(String args[]) {
        penguin penguin1 = new littlePenguin();
        penguinProxy proxy = new penguinProxy(penguin1);
        proxy.beating();
    }
}