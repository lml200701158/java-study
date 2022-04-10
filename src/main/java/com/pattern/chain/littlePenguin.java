package com.pattern.chain;

public class littlePenguin extends penguin {
    public littlePenguin() {
        this.level = 1;
    }
    @Override
    public void print(String message) {
        System.out.println("Little Penguin:" + message);
    }
}