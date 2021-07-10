package com.pattern.builder.goodbuilder;

public class test {
    public static void main(String[] args) {
        penguin penguin1 = new penguin.penguinBuilder().setName("楼仔").
                                                        setSex("男").
                                                        setHeignt(170).
                                                        setAge(18).
                                                        bulid();
        penguin1.print();

        penguin penguin2 = new penguin.penguinBuilder().setName("楼仔").
                                                        setAge(18).
                                                        bulid();
        penguin2.print();
    }
}
