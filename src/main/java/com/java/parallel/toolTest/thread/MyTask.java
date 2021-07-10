package com.java.parallel.toolTest.thread;

public class MyTask implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "已经运行");
    }
    public static void main(String[] args) {
        new Thread(new MyTask(),"线程二").start();
    }
}
