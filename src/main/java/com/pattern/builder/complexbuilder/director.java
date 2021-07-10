package com.pattern.builder.complexbuilder;

public class director {
    penguin.penguinBuilder m_builder;

    public director(penguin.penguinBuilder build) {
        this.m_builder = build;
    }

    public penguin construct(String name, Integer age, String sex, Integer height) {
        return this.m_builder.setAge(age).
                setHeignt(height).
                setName(name).
                setSex(sex).
                bulid();
    }
}
