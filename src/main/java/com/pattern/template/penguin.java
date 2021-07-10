package com.pattern.template;

public abstract class penguin {
    public void eating() {
        System.out.println("吃饭");
    }

    public void sleeping() {
        System.out.println("睡觉");
    }

    public abstract void beating();

    public void everyDay() {
        this.eating();
        this.sleeping();
        this.beating();
    }
}
