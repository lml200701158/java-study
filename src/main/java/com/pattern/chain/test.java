package com.pattern.chain;

public class test {
    public static void main(String[] args) {
        littlePenguin penguin1 = new littlePenguin();
        middlePenguin penguin2 = new middlePenguin();
        bigPenguin penguin3 = new bigPenguin();

        penguin3.nextPenguin = penguin2;
        penguin2.nextPenguin = penguin1;

        penguin3.process(3, "print big/middle/small");
        penguin3.process(2, "print middle/small");
        penguin3.process(1, "print small");
    }
}
