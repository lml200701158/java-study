package com.pattern.proxy;

public class penguinProxy {
    private penguin m_penguin;

    public penguinProxy(penguin p) {
        this.m_penguin = p;
    }

    public void beating() {
        System.out.println("打豆豆前");
        m_penguin.beating();
        System.out.println("打豆豆后");
    }
}
