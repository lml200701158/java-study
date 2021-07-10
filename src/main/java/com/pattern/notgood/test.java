package com.pattern.notgood;

public class test {
    public static void main(String[] args) {
        System.out.println("littlePenguin:");
        littlePenguin penguin_1 = new littlePenguin();
        penguin_1.eating();
        penguin_1.sleeping();
        penguin_1.beating();
        System.out.println("middlePenguin:");
        middlePenguin penguin_2 = new middlePenguin();
        penguin_2.eating();
        penguin_2.sleeping();
        penguin_2.beating();
        System.out.println("bigPenguin:");
        bigPenguin penguin_3 = new bigPenguin();
        penguin_3.eating();
        penguin_3.sleeping();
        penguin_3.beating();
    }
}
