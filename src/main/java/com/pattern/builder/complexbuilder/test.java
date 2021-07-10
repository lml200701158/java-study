package com.pattern.builder.complexbuilder;

public class test {
    public static void main(String[] args) {
        penguin.penguinBuilder builder = new penguin.penguinBuilder();
        director penguinDirector = new director(builder);

        penguin penguin1 =  penguinDirector.construct("楼仔", 18,"男" , 170);
        penguin1.print();
    }
}
