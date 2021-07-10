package com.pattern.factory;

public class test {
    public static void main(String[] args) {
        penguin penguin_1 = penguinFactory.getPenguin("littlePenguin");
        penguin_1.everyDay();
        penguin penguin_2 = penguinFactory.getPenguin("middlePenguin");
        penguin_2.everyDay();
        penguin penguin_3 = penguinFactory.getPenguin("bigPenguin");
        penguin_3.everyDay();
    }
}
