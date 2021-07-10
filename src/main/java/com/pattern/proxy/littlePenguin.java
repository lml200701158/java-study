package com.pattern.proxy;

public class littlePenguin implements penguin {
    @Override
    public void beating() {
        System.out.println("打豆豆");
    }
}
