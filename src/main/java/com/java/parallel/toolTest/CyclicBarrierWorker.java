package com.java.parallel.toolTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierWorker implements Runnable {
    private int id;
    private CyclicBarrier barrier;

    public CyclicBarrierWorker(int id, final CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            if (id == 5) {
                // 让第5个线程sleep 10秒
                Thread.sleep(10000);
            }
            System.out.println(id + " people wait");
            barrier.await(); // 大家等待最后一个线程到达
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class TestCyclicBarrier {
    public static void main(String[] args) {
        int num = 10;
        // 新建一个栅栏
        CyclicBarrier barrier = new CyclicBarrier(num, new Runnable() {
            @Override
            public void run() {
                // num个线程全部执行完毕，且都调用barrier.await()，才会去执行该方法
                // 可以理解为计数器初始值为num，每调用一次barrier.await()，计数器-1，直到计数器等于0
                System.out.println("go on together!");
            }
        });
        for (int i = 1; i <= num; i++) {
            new Thread(new CyclicBarrierWorker(i, barrier)).start();
        }
    }
}
