package com.pattern.chain;

public class bigPenguin extends penguin {
    public bigPenguin() {
        this.level = 3;
    }
    @Override
    public void print(String message) {
        System.out.println("Big Penguin:" + message);
    }
}
