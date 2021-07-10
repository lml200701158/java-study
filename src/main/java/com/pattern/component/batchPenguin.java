package com.pattern.component;

import java.util.ArrayList;
import java.util.List;

public class batchPenguin extends penguin {
    private List<penguin> m_penguins = new ArrayList<>();
    public batchPenguin(String name) {
        super(name);
    }
    @Override
    public void beating() {
        System.out.println(this.name + "打豆豆");
        for (penguin p : m_penguins) {
            p.beating();
        }
    }
    @Override
    public void add(penguin p) {
        m_penguins.add(p);
    }
    @Override
    public void remove(penguin p) {
        m_penguins.remove(p);
    }
    @Override
    public penguin getChild(int i) {
        return m_penguins.get(i);
    }
    @Override
    public List<penguin> getChilds() {
        return m_penguins;
    }
}
