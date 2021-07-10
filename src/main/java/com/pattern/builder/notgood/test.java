package com.pattern.builder.notgood;

public class test {
    public static void main(String[] args) {
        penguin penguin1 = new penguin("楼仔");
        penguin1.print();

        penguin penguin2 = new penguin("楼仔", 18);
        penguin2.print();

        penguin penguin3 = new penguin("楼仔", 18, "男");
        penguin3.print();

        penguin penguin4 = new penguin("楼仔", 18, "男", 180);
        penguin4.print();
    }
}
