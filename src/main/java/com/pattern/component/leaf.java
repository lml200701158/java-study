package com.pattern.component;

public class leaf extends penguin{
    public leaf(String name) {
        super(name);
    }
    @Override
    public void beating() {
        System.out.println(name + "打豆豆");
    }
}
