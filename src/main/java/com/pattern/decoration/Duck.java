package com.pattern.decoration;

public class Duck extends Food {
    public Duck() {
        this.desc = "鸭肉";
    }
    @Override
    public String cook() {
        return this.desc;
    }
}
