package com.pattern.decoration;

import lombok.ToString;

public class Chicken extends Food {
    public Chicken() {
        this.desc = "鸡肉";
    }
    @Override
    public String cook() {
        return this.desc;
    }
}
