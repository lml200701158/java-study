package com.java.parallel.toolTest.thread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "已经运行");

    }
    public static void main(String[] args) {
        new MyThread("线程一").start();
    }
}
