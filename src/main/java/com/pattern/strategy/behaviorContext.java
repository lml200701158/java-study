package com.pattern.strategy;

public class behaviorContext {
    private penguin _penguin;

    public behaviorContext(penguin newPenguin) {
        _penguin = newPenguin;
    }

    public void setPenguin(penguin newPenguin) {
        _penguin = newPenguin;
    }

    public void everyDay() {
        _penguin.eating();
        _penguin.sleeping();
        _penguin.beating();
    }
}
