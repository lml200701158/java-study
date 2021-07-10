package com.java.parallel.toolTest;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public void timeTasks(int nThreads, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                @Override
                public void run()  {
                    try {
                        // 阻塞，等待startGate.countDown()的执行
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                            // 每次执行完毕后，计数器减1，表示有一个事件已经完成
                            endGate.countDown();
                        }
                    } catch(InterruptedException e) {
                        System.out.println("Throw Exception, e:" + e.toString());
                    }
                }
            };
            // 启动线程
            t.start();
        }

        long start = System.nanoTime();
        System.out.println("打开闭锁");
        startGate.countDown(); // 打开开关，进入startGate.await()后面的逻辑
        endGate.await(); // 等待所有线程endGate.countDown()全部执行完毕
        long end = System.nanoTime();
        System.out.println("闭锁退出，共耗时" + (end-start));
    }

    class RunnableTask implements Runnable {
        @Override
        public void run() {
            System.out.println("当前线程为：" + Thread.currentThread().getName());
        }
    }

    public static void main(String args[]) throws InterruptedException {
        CountDownLatchTest test = new CountDownLatchTest();
        test.timeTasks(5, test.new RunnableTask());
    }
}
