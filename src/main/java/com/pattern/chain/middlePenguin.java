package com.pattern.chain;

public class middlePenguin extends penguin {
    public middlePenguin() {
        this.level = 2;
    }
    @Override
    public void print(String message) {
        System.out.println("Middle Penguin:" + message);
    }
}
