package com.pattern.strategy;

public class test {
    public static void main(String[] args) {
        behaviorContext behavior = new behaviorContext(new littlePenguin());
        behavior.everyDay();

        behavior.setPenguin(new middlePenguin());
        behavior.everyDay();

        behavior.setPenguin(new bigPenguin());
        behavior.everyDay();
    }
}
