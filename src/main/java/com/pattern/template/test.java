package com.pattern.template;


public class test {
    public static void main(String[] args) {
        System.out.println("littlePenguin:");
        littlePenguin penguin1 = new littlePenguin();
        penguin1.everyDay();
        System.out.println("middlePenguin:");
        middlePenguin penguin2 = new middlePenguin();
        penguin2.everyDay();
        System.out.println("bigPenguin:");
        bigPenguin penguin3 = new bigPenguin();
        penguin3.everyDay();
    }
}
