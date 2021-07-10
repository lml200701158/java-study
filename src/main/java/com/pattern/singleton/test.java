package com.pattern.singleton;

import java.util.concurrent.CountDownLatch;

public class test {
    public static void main(String args[]) {
        final CountDownLatch latch = new CountDownLatch(1);
        int threadCount = 10;
        for (int i = 0; i < threadCount; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(penguin.getInstance().hashCode());
                }
            }.start();
        }
        latch.countDown();
    }
}
