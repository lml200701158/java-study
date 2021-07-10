package com.pattern.component;

import java.util.List;

public abstract class penguin {
    protected String name;

    public penguin(String name) {
        this.name = name;
    }

    public abstract void beating();

    public void add(penguin p) {
        throw new UnsupportedOperationException();
    }
    public void remove(penguin p) {
        throw new UnsupportedOperationException();
    }
    public penguin getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public List<penguin> getChilds() {
        throw new UnsupportedOperationException();
    }
}
